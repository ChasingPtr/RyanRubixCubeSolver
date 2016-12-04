public class FaceController {
	static void printOut(String s) {
		System.out.println(s);
	}

	private FaceState faceState;
	private boolean clockwise = true;
	private ArduinoController arduino;

	public FaceController(ArduinoController ardController, Color top, Color front) {
		arduino = ardController;
		faceState = new FaceState(top, front);
	}

	/*
	 * Operations to modify the state
	 */
	public void flip() {
		printOut("flipping");
		faceState.flip();
		arduino.sendFlip();
	}
	public void turn() {
		printOut("turning");
		faceState.turn(clockwise);
		arduino.sendTurn();
		clockwise = !clockwise;
	}
	public void hold() {
		printOut("holding");
		faceState.hold();
		arduino.sendHold();
		clockwise = !clockwise;
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

	public void performOperation(Color face, boolean turnClockwise) {
		putColorBottom(face);
		if (turnClockwise == clockwise) {
			hold();
		} else {
			// We're looking at it from the top, but the color face
			// is at the bottom. So, our clockwise is the user's counter-
			// clockwise
			hold();
			turn();
			hold();
			turn();
			hold();
			turn();


		}


	}


	public void print() {
		faceState.print();
		System.out.println("clockwise: " + String.valueOf(clockwise));
	}


}
