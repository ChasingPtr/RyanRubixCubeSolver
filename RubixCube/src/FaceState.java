
public class FaceState {
	Boolean doPrint;
	
	public void suppressPrints() {
		doPrint = false;
	}
	
	void printOut(String s) {
		if (doPrint)
			System.out.println(s);
	}
	void printTop() {
		printOut("top is " + top().toString());			
	}

	private Color topColor;
	private Color frontColor;

	public FaceState(Color top, Color front) {
		reset(top, front);
		doPrint = true;
	}

	private void reset(Color top, Color front) {
		topColor = top;
		frontColor = front;
	}

	/*
	 * Operations to modify the state
	 */
	public void flip() {
		reset(front(), bottom());
		printTop();
	}
	public void turn(boolean clockwise) {
		if (clockwise) {
			reset(top(), right());
		} else {
			reset(top(), left());
		}
		printTop();
	}
	public void hold() {
		printTop();
	}

	/*
	 * Queries about current state
	 */
	static private Color getOpposingColor(Color c) {
		switch (c) {
		case White: return Color.Yellow;
		case Red: return Color.Orange;
		case Blue: return Color.Green;
		case Yellow: return Color.White;
		case Orange: return Color.Red;
		case Green: return Color.Blue;
		default:
			System.out.println("Unknown top color)");
			return Color.INVALID;
		}

	}
	public Color top() { return topColor; }
	public Color front() { return frontColor; }
	public Color bottom() {
		return getOpposingColor(topColor);
	}
	public Color back() {
		return getOpposingColor(frontColor);
	}

	public Color left() {
		switch (topColor) {
		case White:
			switch (frontColor) {
			//case White: return Color.Yellow;
			case Red: return Color.Green;
			case Blue: return Color.Red;
			//case Yellow: return Color.White;
			case Orange: return Color.Blue;
			case Green: return Color.Orange;
			default:
				System.out.println("Unknown top color)");
				return Color.INVALID;
			}			
		case Red: 
			switch (frontColor) {
			case White: return Color.Blue;
			//case Red: return Color.Orange;
			case Blue: return Color.Yellow;
			case Yellow: return Color.Green;
			//case Orange: return Color.Red;
			case Green: return Color.White;
			default:
				System.out.println("Unknown top color)");
				return Color.INVALID;
			}
		case Blue: 
			switch (frontColor) {
			case White: return Color.Orange;
			case Red: return Color.White;
			//case Blue: return Color.Green;
			case Yellow: return Color.Red;
			case Orange: return Color.Yellow;
			//case Green: return Color.Blue;
			default:
				System.out.println("Unknown top color)");
				return Color.INVALID;
			}
		case Yellow: 
			switch (frontColor) {
			//case White: return Color.Yellow;
			case Red: return Color.Blue;
			case Blue: return Color.Orange;
			//case Yellow: return Color.White;
			case Orange: return Color.Green;
			case Green: return Color.Red;
			default:
				System.out.println("Unknown top color)");
				return Color.INVALID;
			}
		case Orange: 
			switch (frontColor) {
			case White: return Color.Green;
			//case Red: return Color.Orange;
			case Blue: return Color.White;
			case Yellow: return Color.Blue;
			//case Orange: return Color.Red;
			case Green: return Color.Yellow;
			default:
				System.out.println("Unknown top color)");
				return Color.INVALID;
			}
		case Green: 
			switch (frontColor) {
			case White: return Color.Red;
			case Red: return Color.Yellow;
			//case Blue: return Color.Green;
			case Yellow: return Color.Orange;
			case Orange: return Color.White;
			//case Green: return Color.Blue;
			default:
				System.out.println("Unknown top color)");
				return Color.INVALID;
			}
		default:
			System.out.println("Unknown top color)");
			return Color.INVALID;
		}		
	}

	public Color right() {
		return getOpposingColor(left());
	}

	public void print() {
		System.out.println("Cube face state: top is " + top().asString() + ", front is " + front().asString());
	}
}
