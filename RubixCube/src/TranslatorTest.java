import java.util.HashMap;
import java.io.StringReader;
import java.util.ArrayList;
import java.lang.Character;
import java.io.IOException;


class TranslatorSingleTest {
	String input;
	String expectedOutput;
	
	public TranslatorSingleTest(String in, String exOut) {
		input = in;
		expectedOutput = exOut;
	}
	
	static public Boolean allEqual(ArrayList<String> listA, ArrayList<String> listB) {
		if (listA.size() != listB.size())
			return false;
		Boolean result = true;
		for (int i = 0; i < listA.size(); ++i) {
			result = result && listA.get(i).equals(listB.get(i));			
		}
		return result;
	}
	
	public void performTest() throws IOException {
		FaceController faceController = new FaceController(new DummyArduinoController(), Color.Blue, Color.Red);
		faceController.suppressPrints();
		
		ArrayList<FaceCommand> commands = FaceCommand.solutionFromString(input);
		for (FaceCommand command : commands) {
			faceController.performOperation(command);
		}
		faceController.commit();

		String resultCommands = FaceController.commandsAsString(faceController.commands);
		Boolean matches = resultCommands.equals(expectedOutput);
		
		if (matches) {
			System.out.println("Passed!");
			return;
		}		
		
		System.out.println("FAIL:");
		System.out.println("Expected:");
		System.out.println(expectedOutput);
		System.out.println("Actual:");
		System.out.println(resultCommands);
	}
	
}


public class TranslatorTest {

	

	public static void main(String[] args) throws Exception {
//		{
//			String input = "[green Counter Clockwise][orange Counter Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise]";
//			String expectedOutput = "turn hold turn flip flip flip hold turn flip turn hold turn hold turn hold turn hold turn hold turn hold turn hold turn hold turn hold";
//			TranslatorSingleTest test = new TranslatorSingleTest(input, expectedOutput);
//			test.performTest();
//		}
//		{
//			String input = "[green Counter Clockwise][orange Counter Clockwise][yellow Clockwise]";
//			String expectedOutput = "turn hold turn flip flip flip hold turn flip turn hold turn hold turn hold turn hold turn hold turn hold turn hold turn hold turn hold";
//			TranslatorSingleTest test = new TranslatorSingleTest(input, expectedOutput);
//			test.performTest();
//		}
		{
			String input = "[orange Clockwise][yellow Clockwise][blue Clockwise][green Counter Clockwise][red Clockwise][red Clockwise][blue Counter Clockwise]";
			String expectedOutput = "turn hold turn flip flip flip hold turn flip turn hold turn hold turn hold turn hold turn hold turn hold turn hold turn hold turn hold";
			TranslatorSingleTest test = new TranslatorSingleTest(input, expectedOutput);
			test.performTest();
		}
	}
}
