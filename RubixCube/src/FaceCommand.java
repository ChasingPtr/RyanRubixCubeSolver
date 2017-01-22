import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class FaceCommand {
	Color color;
	boolean clockwise;
	
	FaceCommand(Color c, boolean clkwise) {
		color = c;
		clockwise = clkwise;
	}
	
	public void print() {
		System.out.print(asString());
	}
	
	public String asString() {
		return color.asString() + " " + (clockwise ? "Clockwise" : "Counter Clockwise");
	}
	
	public Boolean equals(FaceCommand other) {
		return color.equals(other.color) && clockwise == other.clockwise;
	}
	
	FaceCommand(String s) {
		// "white Clockwise" ==> ["white", "Clockwise"]
		String[] tuple = s.split(" ");
		color = Color.fromString(tuple[0]);
		String direction = tuple[1];
		assert(direction.equals("Clockwise") || direction.equals("Counter"));
		clockwise = direction.equals("Clockwise");
	}
	
	public static String solutionAsString(ArrayList<FaceCommand> solution) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < solution.size(); ++i) {
			builder.append("[");
			builder.append(solution.get(i).asString());
			builder.append("]");
		}
		return builder.toString();
	}
	public static ArrayList<FaceCommand> solutionFromString(String str) throws IOException {
		ArrayList<FaceCommand> result = new ArrayList<FaceCommand>();
		StringReader reader = new StringReader(str);
		int firstChar = reader.read();
		while (firstChar != -1) {
			assert(firstChar == '[');
			StringBuilder singleCommand = new StringBuilder();
			int nextChar = reader.read();
			assert(nextChar != -1);
			while (nextChar != ']') {
				singleCommand.append((char)nextChar);
				nextChar = (char)reader.read();
			}
			firstChar = reader.read();
			result.add(new FaceCommand(singleCommand.toString()));
		}
		return result;
	}
	
}
