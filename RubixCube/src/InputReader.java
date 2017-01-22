import java.util.Scanner;

public class InputReader {
	static Scanner data = new Scanner(System.in);

	public static String[] readAndSplitLine() {
		return data.nextLine().split(" ");
	}
	
	public static int[][] getColors() {
		int playerInput[][] = new int[6][9];
		int counter = 0;
		System.out.println("1 = white 2 = red 3 = yellow 4 = orange "
				+ "5 = blue 6 = green");
		System.out.println("Space separated per square, newline for each face");
		System.out.println("white, red, yellow, orange, blue, green");

		for (int i = 0; i < 6; ++i) {
			String[] line = readAndSplitLine();
			for (int j = 0; j < 9; ++j) {
				playerInput[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		return playerInput;
	} 
}
