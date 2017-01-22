import gnu.io.SerialPortEvent;

public class DummyArduinoController extends ArduinoController {
	public void flush() {}
	public void sendInstructions(String s) {}
	public void initialize() {}
	public synchronized void serialEvent(SerialPortEvent oEvent) {}
	static void printOut(String s) {}
	public void addFlip() {}
	public void addTurn() {}
	public void addHold() {}






}
