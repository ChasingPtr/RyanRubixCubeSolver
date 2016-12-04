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
}
	