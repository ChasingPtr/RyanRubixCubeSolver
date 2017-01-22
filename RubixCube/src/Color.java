public enum Color {
	White(1),
	Red(2),
	Yellow(3),
	Orange(4),
	Blue(5),
	Green(6),
	INVALID(-1);

	private int value;

	private Color(int v) {
		this.value = v;
	}

	public static Color fromString(String s) {
		if (s.equals("white")) {
			return White;
		}
		if (s.equals("red")) {
			return Red;
		}
		if (s.equals("yellow")) {
			return Yellow;
		}
		if (s.equals("orange")) {
			return Orange;
		}
		if (s.equals("blue")) {
			return Blue;
		}
		if (s.equals("green")) {
			return Green;
		}
		assert(false);
		return White;
	}



	public String asString() {
		switch (this) {
		case White: return "white";
		case Red: return "red";
		case Yellow: return "yellow";
		case Orange: return "orange";
		case Blue: return "blue";
		case Green: return "green";
		default:
			return "INVALID";
		}
	}

	public void print() {
		System.out.print(asString());
	}
	public Boolean equals(Color other) {
		return value == other.value;
	}
}
