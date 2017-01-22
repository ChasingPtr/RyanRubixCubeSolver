//import rubixCube
import java.util.HashMap;
import java.io.StringReader;
import java.util.ArrayList;
import java.lang.Character;
import java.io.IOException;

class SolutionBuilder {
	public ArrayList<FaceCommand> solution;

	public SolutionBuilder() {
		solution = new ArrayList<FaceCommand>();
	}

	public void add(Color color, Boolean clockwise) {
		solution.add(new FaceCommand(color, clockwise));
	}
}

class Test {
	int[][] input;
	ArrayList<FaceCommand> expectedSolution;

	public Test(int[][] in, ArrayList<FaceCommand> expected) {
		input = in;
		expectedSolution = expected;
	}

	public void performTest() {
		ArduinoController main = new DummyArduinoController();
		main.initialize();
		FaceController faceController = new DummyFaceController(main, Color.White, Color.White);

		rubixCube cube = new rubixCube(faceController);
		cube.suppressPrints();
		cube.solveCube(input);
		Boolean matches = allEqual(cube.solutionCommands, expectedSolution);
		if (matches) {
			System.out.println("Passed!");
			return;
		}

		System.out.println("FAIL:");
		System.out.println("Expected:");
		System.out.println(FaceCommand.solutionAsString(expectedSolution));
		System.out.println("Actual:");
		System.out.println(FaceCommand.solutionAsString(cube.solutionCommands));
	}

	static public Boolean allEqual(ArrayList<FaceCommand> listA, ArrayList<FaceCommand> listB) {
		if (listA.size() != listB.size())
			return false;
		Boolean result = true;
		for (int i = 0; i < listA.size(); ++i) {
			result = result && listA.get(i).asString().equals(listB.get(i).asString());			
		}
		return result;
	}	
}

public class SolverTest {
	ArrayList<Test> tests;

	public void addExamples() throws Exception {
		{
			int[][] input1 = {
					{5,1,1,5,1,1,4,4,4},
					{2, 2, 2, 2, 2, 2, 5, 1, 1},
					{3,3, 6, 3, 3, 6, 2, 2, 2},
					{4, 4, 4, 4, 4, 4, 3, 3, 6},
					{3,3,3, 5,5,5,5,5,5},
					{1,6,6, 1,6,6, 1,6,6}           
			};		
			ArrayList<FaceCommand> expectedSolution1 = 
					FaceCommand.solutionFromString("[green Counter Clockwise][orange Counter Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise]");
			tests.add(new Test(input1, expectedSolution1));
		}

		{
			int[][] input2 = {
					{4,6,2,5,1,2,2,5,5},
					{6,4,3,5,2,6,2,3,6},
					{4,1,4,1,3,2,1,6,6},
					{1,3,6,1,4,4,4,3,3},
					{3,6,5,4,5,4,3,3,5},
					{1,2,2,1,6,2,5,5,1}           
			};		
			ArrayList<FaceCommand> expectedSolution2 = 
					FaceCommand.solutionFromString("[blue Clockwise][white Clockwise][yellow Counter Clockwise][green Clockwise][orange Counter Clockwise][white Counter Clockwise][orange Clockwise][orange Clockwise][white Clockwise][green Counter Clockwise][white Counter Clockwise][red Clockwise][white Clockwise][yellow Clockwise][green Clockwise][yellow Counter Clockwise][green Counter Clockwise][red Clockwise][yellow Clockwise][red Counter Clockwise][yellow Counter Clockwise][red Clockwise][yellow Clockwise][red Counter Clockwise][orange Clockwise][yellow Clockwise][orange Counter Clockwise][yellow Counter Clockwise][orange Clockwise][yellow Clockwise][orange Counter Clockwise][yellow Clockwise][orange Clockwise][yellow Counter Clockwise][orange Counter Clockwise][yellow Counter Clockwise][green Counter Clockwise][yellow Clockwise][green Clockwise][yellow Clockwise][yellow Clockwise][blue Counter Clockwise][yellow Counter Clockwise][blue Clockwise][yellow Clockwise][red Clockwise][yellow Clockwise][red Counter Clockwise][yellow Clockwise][red Counter Clockwise][yellow Counter Clockwise][red Clockwise][yellow Clockwise][green Clockwise][yellow Clockwise][green Counter Clockwise][yellow Clockwise][green Counter Clockwise][yellow Counter Clockwise][green Clockwise][yellow Clockwise][orange Clockwise][yellow Clockwise][orange Counter Clockwise][yellow Clockwise][blue Clockwise][yellow Counter Clockwise][blue Counter Clockwise][yellow Counter Clockwise][orange Counter Clockwise][yellow Clockwise][orange Clockwise][green Clockwise][yellow Clockwise][orange Clockwise][yellow Counter Clockwise][orange Counter Clockwise][green Counter Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][green Clockwise][yellow Clockwise][yellow Clockwise][green Counter Clockwise][yellow Counter Clockwise][green Clockwise][yellow Counter Clockwise][green Counter Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][yellow Clockwise][red Clockwise][red Clockwise][yellow Counter Clockwise][blue Clockwise][green Counter Clockwise][red Clockwise][red Clockwise][blue Counter Clockwise][green Clockwise][yellow Counter Clockwise][red Clockwise][red Clockwise][yellow Counter Clockwise][yellow Clockwise][yellow Clockwise]");
			tests.add(new Test(input2, expectedSolution2));
		}
		
	}

	public SolverTest() {
		tests = new ArrayList<Test>();
	}


	public static void main(String[] args) throws Exception {
		SolverTest solverTest = new SolverTest();
		solverTest.addExamples();
		for (Test test : solverTest.tests) {
			test.performTest();
		}
	}
}

