import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import gnu.io.CommPortIdentifier; 
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent; 
import gnu.io.SerialPortEventListener;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.stream.Stream;

public class ArduinoController implements SerialPortEventListener {
	SerialPort serialPort;
	/** The port we're normally going to use. */
	private static final String PORT_NAMES[] = { 
			"/dev/tty.wchusbserial1420", // My Arduino rsolver
			//"/dev/tty.usbserial-A9007UX1", // Mac OS X
			//            "/dev/ttyACM0", // Raspberry Pi
			//"/dev/ttyUSB0", // Linux
			//"COM3", // Windows
	};

	/**
	 * A BufferedReader which will be fed by a InputStreamReader 
	 * converting the bytes into characters 
	 * making the displayed results codepage independent
	 */
	private BufferedReader input;
	/** The output stream to the port */
	private OutputStream output;
	/** Milliseconds to block while waiting for port open */
	private static final int TIME_OUT = 2000;
	/** Default bits per second for COM port. */
	private static final int DATA_RATE = 115200;

	public String commands = "";

	public void flush() {
		printOut("beginning flush");
		if (commands != "") {
			printOut("Command string to send: " + commands);
			sendInstructions(commands);
		}
		commands = "";
		try {
			output.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printOut("done output.flush");
		//Stream<String> inputLines = input.lines();
		//Iterator<String> inputIter = inputLines.iterator();
		//while (inputIter.hasNext()) {
		//	printOut(inputIter.toString());
		//}
		//for (Object s : inputLines.toArray()) {
		//	printOut((String)s);
		//}
		//printOut("done input flush");
	}

	public void send(byte[] bytes) {
		try {
			output.write(bytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//flush();
	}
	public void send(char c) {
		byte[] bytes = new byte[1];
		bytes[0] = (byte)c;
		send(bytes);
	}

	//	public void send(String s) {
	//		               printOut("sending: " + s);
	//		               send(s.getBytes());
	//		               send('\0');
	//	}
	//	
	public void addFlip() {
		printOut("adding flip");
		commands += "F";
	}
	public void addTurn() {
		printOut("adding turn");
		commands += "T";
	}
	public void addHold() {
		printOut("adding hold");
		commands += "H";
	}

	//	public void handshake() {
	//		send("H");
	//	}

	public void sendInstructions(String s) {
		String cmdStr = "I" + String.valueOf(s.length()) + s + '\0';
		//String cmdStr = "I" + String.valueOf(s.length()) + s + '\0';
		printOut("sending: " + cmdStr);
		send(cmdStr.getBytes());
	}

	public void initialize() {
		// the next line is for Raspberry Pi and 
		// gets us into the while loop and was suggested here was suggested http://www.raspberrypi.org/phpBB3/viewtopic.php?f=81&t=32186
		//System.setProperty("gnu.io.rxtx.SerialPorts", PORT_NAMES[0]);
		printOut("Beginning initialize");
		CommPortIdentifier portId = null;
		Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

		//First, Find an instance of serial port as set in PORT_NAMES.
		while (portEnum.hasMoreElements()) {
			CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
			if (currPortId.getName().startsWith(""))
				for (String portName : PORT_NAMES) {
					if (currPortId.getName().equals(portName)) {
						portId = currPortId;
						break;
					}
				}
		}
		if (portId == null) {
			System.out.println("Could not find COM port.");
			return;
		}

		try {
			// open serial port, and use class name for the appName.
			serialPort = (SerialPort) portId.open(this.getClass().getName(),
					TIME_OUT);

			// set port parameters
			serialPort.setSerialPortParams(DATA_RATE,
					SerialPort.DATABITS_8,
					SerialPort.STOPBITS_1,
					SerialPort.PARITY_NONE);

			// open the streams
			input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
			output = serialPort.getOutputStream();

			// add event listeners
			serialPort.addEventListener(this);
			serialPort.notifyOnDataAvailable(true);

			//sendTurn();
			//output.flush();
		} catch (Exception e) {
			System.err.println(e.toString());
			System.exit(1);
		}
		printOut("End initialize");
	}

	/**
	 * This should be called when you stop using the port.
	 * This will prevent port locking on platforms like Linux.
	 */
	public synchronized void close() {
		if (serialPort != null) {
			flush();
			serialPort.removeEventListener();
			serialPort.close();
		}
		printOut("ending close");
	}

	/**
	 * Handle an event on the serial port. Read the data and print it.
	 */
	public synchronized void serialEvent(SerialPortEvent oEvent) {
		printOut("Beginning serialEvent");

		switch (oEvent.getEventType()) {
		case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
			printOut("empty)");
			break;

			// Field descriptor #8 I
		case SerialPortEvent.CTS: printOut("CTS"); break;

		// Field descriptor #8 I
		case SerialPortEvent.DSR: printOut("DSR"); break;

		// Field descriptor #8 I
		case SerialPortEvent.RI: printOut("RI"); break;

		// Field descriptor #8 I
		case SerialPortEvent.CD: printOut("CD"); break;

		// Field descriptor #8 I
		case SerialPortEvent.OE: printOut("OE"); break;

		// Field descriptor #8 I
		case SerialPortEvent.PE: printOut("PE"); break;

		// Field descriptor #8 I
		case SerialPortEvent.FE: printOut("FE"); break;

		// Field descriptor #8 I
		case SerialPortEvent.BI: printOut("BI"); break;

		default: printOut(String.valueOf(oEvent.getEventType())); break;
		}
		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				printOut("trying to read available data");
				String inputLine=input.readLine();
				System.out.println(inputLine);
				printOut("done reading available data");
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}
		// Ignore all the other eventTypes, but you should consider the other ones.
	}	

	static void printOut(String s) {
		System.out.println(s);
	}

}
