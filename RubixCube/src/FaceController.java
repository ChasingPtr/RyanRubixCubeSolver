import java.util.ArrayList;

public class FaceController {
	ArrayList<String> commands;
	
	Boolean doPrint;
	
	void printOut(String s) {
		if (doPrint)
			System.out.println(s);
	}
	
	public static String commandsAsString(ArrayList<String> commands) {
		return String.join(" ", commands);
	}
	
	public static ArrayList<String> commandsFromString(String str) {
		ArrayList<String> result = new ArrayList<String>();
		for (String substring : str.split(" "))
			result.add(substring);
		return result;
	}

	private FaceState faceState;
	private boolean clockwise = false; // Choose a default based on what the servo expects
	private ArduinoController arduino;

	public FaceController(ArduinoController ardController, Color top, Color front) {
		arduino = ardController;
		faceState = new FaceState(top, front);
		commands = new ArrayList<String>();
		doPrint = true;
	}
	

	public void suppressPrints() {
		doPrint = false;
		faceState.suppressPrints();
	}
	
	/*
	 * Operations to modify the state
	 */
	public void flip() {
		faceState.flip();
		commands.add("flip");
		arduino.addFlip();
	}
	public void turn() {
		commands.add("turn");
		faceState.turn(clockwise);
		arduino.addTurn();
		clockwise = !clockwise;
	}
	public void hold() {
		commands.add("hold");
		faceState.hold();
		arduino.addHold();
		clockwise = !clockwise;
	}
	
	public void commit() {
		printCommands();
		arduino.flush();
	}
	
	public void printCommands() {
		printOut(commandsAsString(commands));
	}

	/*
	 * Higher level goals and operations
	 */
	public void putColorBottom(Color c) {
		while (faceState.bottom() != c) {
			if (faceState.left() == c || faceState.right() == c ) {
				turn();
			}
			flip();
		}
	}

	public void performOperation(FaceCommand command) {
		performOperation(command.color, command.clockwise);
	}
	
	public void performOperation(Color face, boolean turnClockwise) {
		putColorBottom(face);
		if (turnClockwise) {
			if (clockwise) {
				
				turn();
				hold();
			
			} else {
				
				hold();
			}
		} else {
			if (clockwise) {
			
				hold();
			} else {
				turn();
				hold();
			}
		}
	}


	public void print() {
		if (!doPrint)
			return;
		faceState.print();
		printOut("clockwise: " + String.valueOf(clockwise));
	}


}
