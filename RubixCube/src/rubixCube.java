/*
 System.out.println("Checkpoint");
		System.out.println(Cube_colors[0][0]);
		 System.out.println(Cube_colors[0][1]);
		 System.out.println(Cube_colors[0][2]);
		 System.out.println(Cube_colors[0][3]);
		 System.out.println(Cube_colors[0][4]);
		 System.out.println(Cube_colors[0][5]);
		 System.out.println(Cube_colors[0][6]);
		 System.out.println(Cube_colors[0][7]);
		 System.out.println(Cube_colors[0][8]);
		 System.out.println(Cube_colors[1][0]);
		 System.out.println(Cube_colors[1][1]);
		 System.out.println(Cube_colors[1][2]);
		 System.out.println(Cube_colors[1][3]);
		 System.out.println(Cube_colors[1][4]);
		 System.out.println(Cube_colors[1][5]);
		 System.out.println(Cube_colors[1][6]);
		 System.out.println(Cube_colors[1][7]);
		 System.out.println(Cube_colors[1][8]);
		 System.out.println(Cube_colors[2][0]);
		 System.out.println(Cube_colors[2][1]);
		 System.out.println(Cube_colors[2][2]);
		 System.out.println(Cube_colors[2][3]);
		 System.out.println(Cube_colors[2][4]);
		 System.out.println(Cube_colors[2][5]);
		 System.out.println(Cube_colors[2][6]);
		 System.out.println(Cube_colors[2][7]);
		 System.out.println(Cube_colors[2][8]);
		 System.out.println(Cube_colors[3][0]);
		 System.out.println(Cube_colors[3][1]);
		 System.out.println(Cube_colors[3][2]);
		 System.out.println(Cube_colors[3][3]);
		 System.out.println(Cube_colors[3][4]);
		 System.out.println(Cube_colors[3][5]);
		 System.out.println(Cube_colors[3][6]);
		 System.out.println(Cube_colors[3][7]);
		 System.out.println(Cube_colors[3][8]);
		 System.out.println(Cube_colors[4][0]);
		 System.out.println(Cube_colors[4][1]);
		 System.out.println(Cube_colors[4][2]);
		 System.out.println(Cube_colors[4][3]);
		 System.out.println(Cube_colors[4][4]);
		 System.out.println(Cube_colors[4][5]);
		 System.out.println(Cube_colors[4][6]);
		 System.out.println(Cube_colors[4][7]);
		 System.out.println(Cube_colors[4][8]);
		 System.out.println(Cube_colors[5][0]);
		 System.out.println(Cube_colors[5][1]);
		 System.out.println(Cube_colors[5][2]);
		 System.out.println(Cube_colors[5][3]);
		 System.out.println(Cube_colors[5][4]);
		 System.out.println(Cube_colors[5][5]);
		 System.out.println(Cube_colors[5][6]);
		 System.out.println(Cube_colors[5][7]);
		 System.out.println(Cube_colors[5][8]);
 */

import java.util.ArrayList;
import java.util.Scanner;

public class rubixCube {
	static ArrayList<FaceCommand> solutionCommands = new ArrayList<FaceCommand>();
	static FaceController faceController; 
	
	public rubixCube(){
		
		
	}
	
	public static void solveCube(int[][] Cube_colors ) {

		 //whiteClockWise(Cube_colors);
		 //whiteCounterClockWise(Cube_colors);
		 //redClockWise(Cube_colors);
		 //redCounterClockWise(Cube_colors);
		 //yellowClockWise(Cube_colors);
		 //yellowCounterClockWise(Cube_colors);
		 //orangeClockWise(Cube_colors);
		 //orangeCounterClockWise(Cube_colors);
		 //blueClockWise(Cube_colors);
		 //blueCounterClockWise(Cube_colors);
		 //greenClockWise(Cube_colors);
		 //greenCounterClockWise(Cube_colors);
		 
		
		
	     whiteFirstEdge(Cube_colors); 
	   System.out.println("checkpoint1");
		 whiteSecondEdge(Cube_colors);
		 System.out.println("checkpoint2");
		 whiteThirdEdge(Cube_colors); 
		 System.out.println("checkpoint3");
		 whiteFourthEdge(Cube_colors);
		 System.out.println("checkpoint4");

		whiteFirstCornerPart1(Cube_colors);
		System.out.println("checkpoint1");
		whiteFirstCornerPart2(Cube_colors);
		System.out.println("checkpoint2");
		whiteSecondCornerPart1(Cube_colors);
		System.out.println("checkpoint3");
		whiteSecondCornerPart2(Cube_colors);
		System.out.println("checkpoint4");
		whiteThirdCornerPart1(Cube_colors);
		System.out.println("checkpoint5");
		whiteThirdCornerPart2(Cube_colors);
		System.out.println("checkpoint6");
		whiteFourthCornerPart1(Cube_colors);
		System.out.println("checkpoint7");
		whiteFourthCornerPart2(Cube_colors);
		System.out.println("checkpoint8");
		/*
		 System.out.println(Cube_colors[0][0]);
		 System.out.println(Cube_colors[0][1]);
		 System.out.println(Cube_colors[0][2]);
		 System.out.println(Cube_colors[0][3]);
		 System.out.println(Cube_colors[0][4]);
		 System.out.println(Cube_colors[0][5]);
		 System.out.println(Cube_colors[0][6]);
		 System.out.println(Cube_colors[0][7]);
		 System.out.println(Cube_colors[0][8]);
		 System.out.println(Cube_colors[1][0]);
		 System.out.println(Cube_colors[1][1]);
		 System.out.println(Cube_colors[1][2]);
		 System.out.println(Cube_colors[1][3]);
		 System.out.println(Cube_colors[1][4]);
		 System.out.println(Cube_colors[1][5]);
		 System.out.println(Cube_colors[1][6]);
		 System.out.println(Cube_colors[1][7]);
		 System.out.println(Cube_colors[1][8]);
		 System.out.println(Cube_colors[2][0]);
		 System.out.println(Cube_colors[2][1]);
		 System.out.println(Cube_colors[2][2]);
		 System.out.println(Cube_colors[2][3]);
		 System.out.println(Cube_colors[2][4]);
		 System.out.println(Cube_colors[2][5]);
		 System.out.println(Cube_colors[2][6]);
		 System.out.println(Cube_colors[2][7]);
		 System.out.println(Cube_colors[2][8]);
		 System.out.println(Cube_colors[3][0]);
		 System.out.println(Cube_colors[3][1]);
		 System.out.println(Cube_colors[3][2]);
		 System.out.println(Cube_colors[3][3]);
		 System.out.println(Cube_colors[3][4]);
		 System.out.println(Cube_colors[3][5]);
		 System.out.println(Cube_colors[3][6]);
		 System.out.println(Cube_colors[3][7]);
		 System.out.println(Cube_colors[3][8]);
		 System.out.println(Cube_colors[4][0]);
		 System.out.println(Cube_colors[4][1]);
		 System.out.println(Cube_colors[4][2]);
		 System.out.println(Cube_colors[4][3]);
		 System.out.println(Cube_colors[4][4]);
		 System.out.println(Cube_colors[4][5]);
		 System.out.println(Cube_colors[4][6]);
		 System.out.println(Cube_colors[4][7]);
		 System.out.println(Cube_colors[4][8]);
		 System.out.println(Cube_colors[5][0]);
		 System.out.println(Cube_colors[5][1]);
		 System.out.println(Cube_colors[5][2]);
		 System.out.println(Cube_colors[5][3]);
		 System.out.println(Cube_colors[5][4]);
		 System.out.println(Cube_colors[5][5]);
		 System.out.println(Cube_colors[5][6]);
		 System.out.println(Cube_colors[5][7]);
		 System.out.println(Cube_colors[5][8]);
		 */
		 f2lFirstEdgePart1(Cube_colors);
		 System.out.println("checkpoint1");
		 f2lFirstEdgePart2(Cube_colors);
		 System.out.println("checkpoint2");
		 f2lSecondEdgePart1(Cube_colors);
		 System.out.println("checkpoint3");
		 f2lSecondEdgePart2(Cube_colors);
		 System.out.println("checkpoint4");
		 f2lThirdEdgePart1(Cube_colors);
		 System.out.println("checkpoint5");
		 f2lThirdEdgePart2(Cube_colors);
		 System.out.println("checkpoint6");
		 f2lFourthEdgePart1(Cube_colors);
		 System.out.println("checkpoint7");
		 f2lFourthEdgePart2(Cube_colors);
		 System.out.println("checkpoint8");
		 yellowCross(Cube_colors);
		 System.out.println("checkpoint1");
		 		
	}

	 public static void main(String[] args) throws InterruptedException 
	    {
		 
		 ArduinoController main = new ArduinoController();
			main.initialize();
			Thread t=new Thread() {
				public void run() {
					//the following line will keep this app alive for 1000 seconds,
					//waiting for events to occur and responding to them (printing incoming messages to console).
					//try {Thread.sleep(3000);} catch (InterruptedException ie) {}
					try {Thread.sleep(3000);} catch (InterruptedException ie) {}
					//if (!isInitialized)
						//doInitialSetup(main);
					//main.sendTurn();
					faceController = new FaceController(main, Color.Blue, Color.Red);
					faceController.print();

					int[][] Cube_colors = new int[6][9];
						
					Cube_colors = InputReader.getColors();
					solveCube(Cube_colors);
					
					faceController.print();
					
					main.close();
					
				}
			};
			t.start();
			t.join();
			main.close();
			System.out.println("Started");		 
		 
		// SerialTest RedClockWise = new SerialTest();
			
			//RedClockWise.colorInput(Color.Yellow, Color.Blue, Color.Green);
		
		 
		 printSolutionCommands();
}
	 public static void whiteFirstEdge(int Cube_colors[][]) {
		 //Red
		 //Fix these
		 if (Cube_colors[1][3] == 1 && Cube_colors[0][5] == 2){
			
			 redClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][1] == 1 && Cube_colors[4][7] == 2){
			 blueClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][5] == 1 && Cube_colors[2][3] == 2){
			 redClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][7] == 1 && Cube_colors[5][1] == 2){
			 greenCounterClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 //Blue
		 else if (Cube_colors[4][3] == 1 && Cube_colors[0][1] == 2){
			 blueCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][1] == 1 && Cube_colors[3][1] == 2){
			
			 blueClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 1 && Cube_colors[2][1] == 2){
			 blueClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][7] == 1 && Cube_colors[1][1] == 2){
			 
			 redCounterClockWise(Cube_colors);
		 }
		 //Orange
		 else if (Cube_colors[3][5] == 1 && Cube_colors[0][3] == 2){
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][1] == 1 && Cube_colors[4][1] == 2){
			
			 blueCounterClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][3] == 1 && Cube_colors[2][5] == 2){
			 orangeClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][7] == 1 && Cube_colors[5][7 ] == 2){
			 
			 greenClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 //green
		 else if (Cube_colors[5][3] == 1 && Cube_colors[0][7] == 2){
			 greenClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][1] == 1 && Cube_colors[1][7] == 2){
			
			
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 1 && Cube_colors[2][7] == 2){
			 greenCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][7] == 1 && Cube_colors[3][7 ] == 2){
			 orangeCounterClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 //yellow
		 else if (Cube_colors[2][3] == 1 && Cube_colors[1][5] == 2){
			 redClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][1] == 1 && Cube_colors[4][5] == 2){
			 blueClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][5] == 1 && Cube_colors[3][3] == 2){
			 orangeClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][7] == 1 && Cube_colors[5][5 ] == 2){
			 
			 greenClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[0][1] == 1 && Cube_colors[4][3] == 2){ 
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[0][3] == 1 && Cube_colors[3][5] == 2){ 
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[0][7] == 1 && Cube_colors[5][3] == 2){ 
			 whiteCounterClockWise(Cube_colors);
		 }
	 }
	 
	
	 
	 public static void whiteSecondEdge(int Cube_colors[][]) {
		 //Red
		 if (Cube_colors[1][3] == 1 && Cube_colors[0][5] == 4){
			
			 System.out.println("Something is wrong");
		 }
		 else if (Cube_colors[1][1] == 1 && Cube_colors[4][7] == 4){
			 whiteClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][5] == 1 && Cube_colors[2][3] == 4){
			 //Start here
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][7] == 1 && Cube_colors[5][1] == 4){
			 whiteCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 //Blue
		 else if (Cube_colors[4][3] == 1 && Cube_colors[0][1] == 4){
			 blueClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 
		 }
		 else if (Cube_colors[4][1] == 1 && Cube_colors[3][1] == 4){
			
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 1 && Cube_colors[2][1] == 4){
			 blueCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][7] == 1 && Cube_colors[1][1] == 4){
			 blueClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 //Orange
		 else if (Cube_colors[3][5] == 1 && Cube_colors[0][3] == 4){
			 orangeClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][1] == 1 && Cube_colors[4][1] == 4){
			 whiteClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][3] == 1 && Cube_colors[2][5] == 4){
			 orangeClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][7] == 1 && Cube_colors[5][7] == 4){
			 whiteCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 //green
		 else if (Cube_colors[5][3] == 1 && Cube_colors[0][7] == 4){
			 greenCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][1] == 1 && Cube_colors[1][7] == 4){
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 1 && Cube_colors[2][7] == 4){
			 greenClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][7] == 1 && Cube_colors[3][7] == 4){
			 
			 orangeCounterClockWise(Cube_colors);
		 }
		 //yellow
		 else if (Cube_colors[2][3] == 1 && Cube_colors[1][5] == 4){
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][1] == 1 && Cube_colors[4][5] == 4){
			 whiteClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][5] == 1 && Cube_colors[3][3] == 4){
			 orangeClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][7] == 1 && Cube_colors[5][5] == 4){
			 whiteCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[0][1] == 1 && Cube_colors[4][3] == 4){ 
			 blueClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[0][7] == 1 && Cube_colors[5][3] == 4){ 
			 greenCounterClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 
	 }
	 public static void whiteThirdEdge(int Cube_colors[][]) {
		 //Red
		 if (Cube_colors[1][3] == 1 && Cube_colors[0][5] == 5){
			
			 System.out.println("something is wrong");
		 }
		 else if (Cube_colors[1][1] == 1 && Cube_colors[4][7] == 5){
			 
			 blueClockWise(Cube_colors);
			 
		 }
		 else if (Cube_colors[1][5] == 1 && Cube_colors[2][3] == 5){
			 redCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][7] == 1 && Cube_colors[5][1] == 5){
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 //Blue
		 else if (Cube_colors[4][3] == 1 && Cube_colors[0][1] == 5){
			 blueClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][1] == 1 && Cube_colors[3][1] == 5){
			 whiteCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 1 && Cube_colors[2][1] == 5){
			 blueCounterClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][7] == 1 && Cube_colors[1][1] == 5){
			 whiteClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 //Orange
		 else if (Cube_colors[3][5] == 1 && Cube_colors[0][3] == 5){
			 System.out.println("Something is wrong");
		 }
		 else if (Cube_colors[3][1] == 1 && Cube_colors[4][1] == 5){
			 
			 blueCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][3] == 1 && Cube_colors[2][5] == 5){
			 orangeClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][7] == 1 && Cube_colors[5][7] == 5){
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 //green
		 else if (Cube_colors[5][3] == 1 && Cube_colors[0][7] == 5){
			 greenClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][1] == 1 && Cube_colors[1][7] == 5){
			 whiteClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 1 && Cube_colors[2][7] == 5){
			 greenCounterClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][7] == 1 && Cube_colors[3][7] == 5){
			 whiteCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 //yellow
		 else if (Cube_colors[2][3] == 1 && Cube_colors[1][5] == 5){
			 whiteClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][1] == 1 && Cube_colors[4][5] == 5){
			 blueClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][5] == 1 && Cube_colors[3][3] == 5){
			 whiteCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][7] == 1 && Cube_colors[5][5] == 5){
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[0][7] == 1 && Cube_colors[5][3] == 5){ 
			 greenClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
	 }
	 public static void whiteFourthEdge(int Cube_colors[][]) {
		 //Red
		 if (Cube_colors[1][3] == 1 && Cube_colors[0][5] == 6){
			System.out.println("Something is wrong");
		 }
		 else if (Cube_colors[1][1] == 1 && Cube_colors[4][7] == 6){
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][5] == 1 && Cube_colors[2][3] == 6){
			 redClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][7] == 1 && Cube_colors[5][1] == 6){
			 greenCounterClockWise(Cube_colors);
		 }
		 //Blue
		 else if (Cube_colors[4][3] == 1 && Cube_colors[0][1] == 6){
			System.out.println("Something is wrong");
		 }
		 else if (Cube_colors[4][1] == 1 && Cube_colors[3][1] == 6){
			 whiteClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 1 && Cube_colors[2][1] == 6){
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][7] == 1 && Cube_colors[1][1] == 6){
			 whiteCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 //Orange
		 else if (Cube_colors[3][5] == 1 && Cube_colors[0][3] == 6){
			System.out.println("Something is wrong");
		 }
		 else if (Cube_colors[3][1] == 1 && Cube_colors[4][1] == 6){
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][3] == 1 && Cube_colors[2][5] == 6){
			 whiteCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][7] == 1 && Cube_colors[5][7] == 6){
			 
			 greenClockWise(Cube_colors);
		 }
		 //green
		 else if (Cube_colors[5][3] == 1 && Cube_colors[0][7] == 6){
			 greenClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][1] == 1 && Cube_colors[1][7] == 6){
			 whiteCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 1 && Cube_colors[2][7] == 6){
			 greenCounterClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][7] == 1 && Cube_colors[3][7] == 6){
			 whiteClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 //yellow
		 else if (Cube_colors[2][3] == 1 && Cube_colors[1][5] == 6){
			 whiteCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][1] == 1 && Cube_colors[4][5] == 6){
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
			 whiteClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][5] == 1 && Cube_colors[3][3] == 6){
			 whiteClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 whiteCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][7] == 1 && Cube_colors[5][5] == 6){
			 
			 greenClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
	 }
	 public static void whiteFirstCornerPart1(int Cube_colors[][]) {
      		
		 if (Cube_colors[0][8] == 2 && Cube_colors[1][6] == 6 && Cube_colors[5][0] == 1 ){
			
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][8] == 6 && Cube_colors[1][6] == 1 && Cube_colors[5][0] == 2 ){
			
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[0][2] == 2 && Cube_colors[1][0] == 1 && Cube_colors[4][6] == 6 ){
			
			 
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			
		 }
		 
		 else  if (Cube_colors[0][2] == 6 && Cube_colors[1][0] == 2 && Cube_colors[4][6] == 1 ){
					 
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			
			 
		 }
		 else  if (Cube_colors[0][2] == 1 && Cube_colors[1][0] == 6 && Cube_colors[4][6] == 2 ){
			 
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 
			 
		 }
		 else  if (Cube_colors[0][0] == 2 && Cube_colors[4][0] == 1 && Cube_colors[3][2] == 6 ){
			
			 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[0][0] == 6 && Cube_colors[4][0] == 2 && Cube_colors[3][2] == 1 ){
					 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][0] == 1 && Cube_colors[4][0] == 6 && Cube_colors[3][2] == 2 ){
			 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
			 
		 } 
		 else  if (Cube_colors[0][6] == 2 && Cube_colors[5][6] == 6 && Cube_colors[3][8] == 1 ){
			
			 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[0][6] == 6 && Cube_colors[5][6] == 1 && Cube_colors[3][8] == 2 ){
					 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][6] == 1 && Cube_colors[5][6] == 2 && Cube_colors[3][8] == 6 ){
			 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);;
			 
			 
		 } 
	 }
	 public static void whiteFirstCornerPart2(int Cube_colors[][]) {
   		
		 if (Cube_colors[1][8] == 2 && Cube_colors[2][6] == 6 && Cube_colors[5][2] == 1 ){
			
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[1][8] == 6 && Cube_colors[2][6] == 1 && Cube_colors[5][2] == 2 ){
			
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[1][8] == 1 && Cube_colors[2][6] == 2 && Cube_colors[5][2] == 6 ){
			
			 
			
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[1][2] == 6 && Cube_colors[2][0] == 2 && Cube_colors[4][8] == 1 ){
			
			 
			greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			
		 }
		 
		 else  if (Cube_colors[1][2] == 2 && Cube_colors[2][0] == 1 && Cube_colors[4][8] == 6 ){
					 
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			
			 
		 }
		 else  if (Cube_colors[1][2] == 1 && Cube_colors[2][0] == 6 && Cube_colors[4][8] == 2 ){
			 
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
			 
		 }
		 else  if (Cube_colors[2][2] == 2 && Cube_colors[3][0] == 1 && Cube_colors[4][2] == 6 ){
			
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[2][2] == 1 && Cube_colors[3][0] == 6 && Cube_colors[4][2] == 2 ){
					 
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[2][2] == 6 && Cube_colors[3][0] == 2 && Cube_colors[4][2] == 1 ){
			 
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
			 
		 } 
		 else  if (Cube_colors[2][8] == 2 && Cube_colors[3][6] == 6 && Cube_colors[5][8] == 1 ){
			
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[2][8] == 6 && Cube_colors[3][6] == 1 && Cube_colors[5][8] == 2 ){
					 
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[2][8] == 1 && Cube_colors[3][6] == 2 && Cube_colors[5][8] == 6 ){
			 
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
			 
		 } 
	 }
	 public static void whiteSecondCornerPart1(int Cube_colors[][]) {
   		
		 if (Cube_colors[0][8] == 5 && Cube_colors[1][6] == 2 && Cube_colors[5][0] == 1 ){
			
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][8] == 2 && Cube_colors[1][6] == 1 && Cube_colors[5][0] == 5 ){
			
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[0][8] == 1 && Cube_colors[1][6] == 5 && Cube_colors[5][0] == 2){
			
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[0][2] == 1 && Cube_colors[1][0] == 2 && Cube_colors[4][6] == 5 ){
			
			
			
		 }
		 
		 else  if (Cube_colors[0][2] == 2 && Cube_colors[1][0] == 5 && Cube_colors[4][6] == 1 ){
					 
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			
			 
		 }
		 else  if (Cube_colors[0][2] == 5 && Cube_colors[1][0] == 1 && Cube_colors[4][6] == 2 ){
			 
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 
			 
		 }
		 else  if (Cube_colors[0][0] == 5 && Cube_colors[4][0] == 1 && Cube_colors[3][2] == 2 ){
			
			 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[0][0] == 2 && Cube_colors[4][0] == 5 && Cube_colors[3][2] == 1 ){
					 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][0] == 1 && Cube_colors[4][0] == 2 && Cube_colors[3][2] == 5 ){
			 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
			 
		 } 
		 else  if (Cube_colors[0][6] == 5 && Cube_colors[5][6] == 2 && Cube_colors[3][8] == 1 ){
			
			 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[0][6] == 2 && Cube_colors[5][6] == 1 && Cube_colors[3][8] == 5 ){
					 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][6] == 1 && Cube_colors[5][6] == 5 && Cube_colors[3][8] == 2 ){
			 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);;
			 
			 
		 } 
	 }
	 public static void whiteSecondCornerPart2(int Cube_colors[][]) {
	   		
		 if (Cube_colors[1][8] == 5 && Cube_colors[2][6] == 2 && Cube_colors[5][2] == 1 ){
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[1][8] == 2 && Cube_colors[2][6] == 1 && Cube_colors[5][2] == 5 ){
			
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[1][8] == 1 && Cube_colors[2][6] == 5 && Cube_colors[5][2] == 2 ){
			
			 
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[1][2] == 2 && Cube_colors[2][0] == 5 && Cube_colors[4][8] == 1 ){
			
			 yellowClockWise(Cube_colors);
			redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			
		 }
		 
		 else  if (Cube_colors[1][2] == 5 && Cube_colors[2][0] == 1 && Cube_colors[4][8] == 2 ){
					 
			 
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			
			 
		 }
		 else  if (Cube_colors[1][2] == 1 && Cube_colors[2][0] == 2 && Cube_colors[4][8] == 5 ){
			 
			 
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 
			 
		 }
		 else  if (Cube_colors[2][2] == 5 && Cube_colors[3][0] == 1 && Cube_colors[4][2] == 2 ){
			
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[2][2] == 1 && Cube_colors[3][0] == 2 && Cube_colors[4][2] == 5 ){
					 
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[2][2] == 2 && Cube_colors[3][0] == 5 && Cube_colors[4][2] == 1 ){
			 
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 
			 
		 } 
		 else  if (Cube_colors[2][8] == 5 && Cube_colors[3][6] == 2 && Cube_colors[5][8] == 1 ){
			
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[2][8] == 2 && Cube_colors[3][6] == 1 && Cube_colors[5][8] == 5 ){
			 yellowClockWise(Cube_colors);		 
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[2][8] == 1 && Cube_colors[3][6] == 5 && Cube_colors[5][8] == 2 ){
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 
			 
		 } 
	 }
	 public static void whiteThirdCornerPart1(int Cube_colors[][]) {
	   		
		 if (Cube_colors[0][8] == 4 && Cube_colors[1][6] == 5 && Cube_colors[5][0] == 1 ){
			
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][8] == 5 && Cube_colors[1][6] == 1 && Cube_colors[5][0] == 4 ){
			
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[0][8] == 1 && Cube_colors[1][6] == 4 && Cube_colors[5][0] == 5){
			
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[0][2] == 1 && Cube_colors[1][0] == 5 && Cube_colors[4][6] == 4 ){
			
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			
		 }
		 
		 else  if (Cube_colors[0][2] == 5 && Cube_colors[1][0] == 4 && Cube_colors[4][6] == 1 ){
					 
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			
			 
		 }
		 else  if (Cube_colors[0][2] == 4 && Cube_colors[1][0] == 1 && Cube_colors[4][6] == 5 ){
			 
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 
			 
		 }
		 else  if (Cube_colors[0][0] == 4 && Cube_colors[4][0] == 1 && Cube_colors[3][2] == 5 ){
			
			 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[0][0] == 5 && Cube_colors[4][0] == 4 && Cube_colors[3][2] == 1 ){
					 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][0] == 1 && Cube_colors[4][0] == 5 && Cube_colors[3][2] == 4 ){
			 
			
			 
			 
		 } 
		 else  if (Cube_colors[0][6] == 4 && Cube_colors[5][6] == 5 && Cube_colors[3][8] == 1 ){
			
			 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[0][6] == 5 && Cube_colors[5][6] == 1 && Cube_colors[3][8] == 4 ){
					 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][6] == 1 && Cube_colors[5][6] == 4 && Cube_colors[3][8] == 5 ){
			 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
			 
		 } 
	 }
	 public static void whiteThirdCornerPart2(int Cube_colors[][]) {
	   		
		 if (Cube_colors[1][8] == 4 && Cube_colors[2][6] == 5 && Cube_colors[5][2] == 1 ){
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[1][8] == 5 && Cube_colors[2][6] == 1 && Cube_colors[5][2] == 4 ){
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[1][8] == 1 && Cube_colors[2][6] == 4 && Cube_colors[5][2] == 5 ){
			
			 
			 
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[1][2] == 5 && Cube_colors[2][0] == 4 && Cube_colors[4][8] == 1 ){
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			
		 }
		 
		 else  if (Cube_colors[1][2] == 4 && Cube_colors[2][0] == 1 && Cube_colors[4][8] == 5 ){
			 		 
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			
			 
		 }
		 else  if (Cube_colors[1][2] == 1 && Cube_colors[2][0] == 5 && Cube_colors[4][8] == 4 ){
			 
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
			 
		 }
		 else  if (Cube_colors[2][2] == 4 && Cube_colors[3][0] == 1 && Cube_colors[4][2] == 5 ){
			
			 
			 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[2][2] == 1 && Cube_colors[3][0] == 5 && Cube_colors[4][2] == 4 ){
					 
			 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[2][2] == 5 && Cube_colors[3][0] == 4 && Cube_colors[4][2] == 1 ){
			 
			 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
			 
		 } 
		 else  if (Cube_colors[2][8] == 4 && Cube_colors[3][6] == 5 && Cube_colors[5][8] == 1 ){
			
			 
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[2][8] == 5 && Cube_colors[3][6] == 1 && Cube_colors[5][8] == 4 ){
			
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[2][8] == 1 && Cube_colors[3][6] == 4 && Cube_colors[5][8] == 5 ){
			
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
			 
		 } 
	 }
	 public static void whiteFourthCornerPart1(int Cube_colors[][]) {
	   		
		 if (Cube_colors[0][8] == 6 && Cube_colors[1][6] == 4 && Cube_colors[5][0] == 1 ){
			
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][8] == 4 && Cube_colors[1][6] == 1 && Cube_colors[5][0] == 6 ){
			
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[0][8] == 1 && Cube_colors[1][6] == 6 && Cube_colors[5][0] == 4){
			
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[0][2] == 1 && Cube_colors[1][0] == 4 && Cube_colors[4][6] == 6 ){
			
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			
			
		 }
		 
		 else  if (Cube_colors[0][2] == 4 && Cube_colors[1][0] == 6 && Cube_colors[4][6] == 1 ){
					 
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			
			 
		 }
		 else  if (Cube_colors[0][2] == 6 && Cube_colors[1][0] == 1 && Cube_colors[4][6] == 4 ){
			 
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 
			 
		 }
		 else  if (Cube_colors[0][0] == 6 && Cube_colors[4][0] == 1 && Cube_colors[3][2] == 4 ){
			
			 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[0][0] == 4 && Cube_colors[4][0] == 6 && Cube_colors[3][2] == 1 ){
					 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][0] == 1 && Cube_colors[4][0] == 4 && Cube_colors[3][2] == 6 ){
			 
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 
			 
		 } 
		 else  if (Cube_colors[0][6] == 6 && Cube_colors[5][6] == 4 && Cube_colors[3][8] == 1 ){
			
			 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[0][6] == 4 && Cube_colors[5][6] == 1 && Cube_colors[3][8] == 6 ){
					 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[0][6] == 1 && Cube_colors[5][6] == 6 && Cube_colors[3][8] == 4 ){
			 
			
			 
			 
		 } 
	 }
	 public static void whiteFourthCornerPart2(int Cube_colors[][]) {
	   		
		 if (Cube_colors[1][8] == 6 && Cube_colors[2][6] == 4 && Cube_colors[5][2] == 1 ){
			
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
		 }
		 else  if (Cube_colors[1][8] == 4 && Cube_colors[2][6] == 1 && Cube_colors[5][2] == 6 ){
			 
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[1][8] == 1 && Cube_colors[2][6] == 6 && Cube_colors[5][2] == 4 ){
			
			 
			 
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[1][2] == 4 && Cube_colors[2][0] == 6 && Cube_colors[4][8] == 1 ){
			 yellowCounterClockWise(Cube_colors);
			orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			
		 }
		 
		 else  if (Cube_colors[1][2] == 6 && Cube_colors[2][0] == 1 && Cube_colors[4][8] == 4 ){
			 yellowClockWise(Cube_colors);		 
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			
			 
		 }
		 else  if (Cube_colors[1][2] == 1 && Cube_colors[2][0] == 4 && Cube_colors[4][8] == 6 ){
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
			 
		 }
		 else  if (Cube_colors[2][2] == 6 && Cube_colors[3][0] == 1 && Cube_colors[4][2] == 4 ){
			
			 
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
		 }
		 
		 else  if (Cube_colors[2][2] == 1 && Cube_colors[3][0] == 4 && Cube_colors[4][2] == 6 ){
					 
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[2][2] == 4 && Cube_colors[3][0] == 6 && Cube_colors[4][2] == 1 ){
			 
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
			 
		 } 
		 else  if (Cube_colors[2][8] == 6 && Cube_colors[3][6] == 4 && Cube_colors[5][8] == 1 ){
			
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 
		 else  if (Cube_colors[2][8] == 4 && Cube_colors[3][6] == 1 && Cube_colors[5][8] == 6 ){
			
			 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[2][8] == 1 && Cube_colors[3][6] == 6 && Cube_colors[5][8] == 4 ){
			
			 
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 
			 
		 } 
	 }
	 public static void f2lFirstEdgePart1(int Cube_colors[][]) {
		
		 if (Cube_colors[1][1] == 5 && Cube_colors[4][7] == 2){
			
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][7] == 2 && Cube_colors[5][1] == 5){
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][7] == 5 && Cube_colors[5][1] == 2){
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][7] == 2 && Cube_colors[3][7] == 5){
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[5][7] == 5 && Cube_colors[3][7] == 2){
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][1] == 2 && Cube_colors[4][1] == 5){
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][1] == 5 && Cube_colors[4][1] == 2){
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 
	 }
	 public static void f2lFirstEdgePart2(int Cube_colors[][]) {
			
		 if (Cube_colors[1][5] == 2 && Cube_colors[2][3] == 5){
			
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][5] == 5 && Cube_colors[2][3] == 2){
			 
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 2 && Cube_colors[2][7] == 5){
			 
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 5 && Cube_colors[2][7] == 2){
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[2][5] == 5 && Cube_colors[3][3] == 2){
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][5] == 2 && Cube_colors[3][3] == 5){
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 5 && Cube_colors[2][1] == 2){
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 2 && Cube_colors[2][1] == 5){
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 
	 }
	 public static void f2lSecondEdgePart1(int Cube_colors[][]) {
			
		 if (Cube_colors[1][1] == 6 && Cube_colors[4][7] == 2){
			
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 if (Cube_colors[1][1] == 2 && Cube_colors[4][7] == 6){
				
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[1][7] == 6 && Cube_colors[5][1] == 2){
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][7] == 2 && Cube_colors[3][7] == 6){
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[5][7] == 6 && Cube_colors[3][7] == 2){
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][1] == 2 && Cube_colors[4][1] == 6){
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][1] == 6 && Cube_colors[4][1] == 2){
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 
	 }
	 public static void f2lSecondEdgePart2(int Cube_colors[][]) {
			
		 if (Cube_colors[1][5] == 2 && Cube_colors[2][3] == 6){
			
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][5] == 6 && Cube_colors[2][3] == 2){
			 
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 6 && Cube_colors[2][7] == 2){
			 
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 2 && Cube_colors[2][7] == 6){
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[2][5] == 6 && Cube_colors[3][3] == 2){
			 
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][5] == 2 && Cube_colors[3][3] == 6){
			 
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 6 && Cube_colors[2][1] == 2){
			 yellowClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 2 && Cube_colors[2][1] == 6){
			 
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 
	 }
	 public static void f2lThirdEdgePart1(int Cube_colors[][]) {
			
		 if (Cube_colors[1][1] == 6 && Cube_colors[4][7] == 4){
			
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 if (Cube_colors[1][1] == 4 && Cube_colors[4][7] == 6){
				
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[1][7] == 6 && Cube_colors[5][1] == 4){
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][7] == 4 && Cube_colors[5][1] == 6){
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][7] == 4 && Cube_colors[3][7] == 6){
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[5][7] == 6 && Cube_colors[3][7] == 4){
			
		 }
		 else if (Cube_colors[3][1] == 4 && Cube_colors[4][1] == 6){
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][1] == 6 && Cube_colors[4][1] == 4){
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 
	 }
	 public static void f2lThirdEdgePart2(int Cube_colors[][]) {
			
		 if (Cube_colors[1][5] == 4 && Cube_colors[2][3] == 6){
			
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][5] == 6 && Cube_colors[2][3] == 4){
			 
			
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 4 && Cube_colors[2][7] == 6){
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 6 && Cube_colors[2][7] == 4){
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[2][5] == 6 && Cube_colors[3][3] == 4){
			 
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][5] == 4 && Cube_colors[3][3] == 6){
			 
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 4 && Cube_colors[2][1] == 6){
			 
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 6 && Cube_colors[2][1] == 4){
			 
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 
	 }
	 public static void f2lFourthEdgePart1(int Cube_colors[][]) {
			
		 if (Cube_colors[1][1] == 5 && Cube_colors[4][7] == 4){
			
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 if (Cube_colors[1][1] == 4 && Cube_colors[4][7] == 5){
				
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[1][7] == 5 && Cube_colors[5][1] == 4){
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][7] == 4 && Cube_colors[5][1] == 5){
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 redClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][7] == 4 && Cube_colors[3][7] == 5){
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[5][7] == 5 && Cube_colors[3][7] == 4){
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 else if (Cube_colors[3][1] == 4 && Cube_colors[4][1] == 5){
			 
		 }
		 else if (Cube_colors[3][1] == 5 && Cube_colors[4][1] == 4){
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 
	 }
	 public static void f2lFourthEdgePart2(int Cube_colors[][]) {
			
		 if (Cube_colors[1][5] == 5 && Cube_colors[2][3] == 4){
			
			 
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[1][5] == 4 && Cube_colors[2][3] == 5){
			 
			
			 yellowCounterClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 4 && Cube_colors[2][7] == 5){
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[5][5] == 5 && Cube_colors[2][7] == 4){
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[2][5] == 5 && Cube_colors[3][3] == 4){
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][5] == 4 && Cube_colors[3][3] == 5){
			 
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 4 && Cube_colors[2][1] == 5){
			 
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
		 }
		 else if (Cube_colors[4][5] == 5 && Cube_colors[2][1] == 4){
			 
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 blueCounterClockWise(Cube_colors);
		 }
		 
	 }
	 public static void yellowOll(int Cube_colors[][]) {
   		
		 if (Cube_colors[2][0] != 3 && Cube_colors[2][2] != 3 && Cube_colors[2][6] != 3 && Cube_colors[2][8] != 3 && Cube_colors[1][8] == 3 && Cube_colors[3][6] == 3){
			
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][0] != 3 && Cube_colors[2][2] != 3 && Cube_colors[2][6] != 3 && Cube_colors[2][8] != 3 && Cube_colors[1][2] == 3 && Cube_colors[1][8] == 3 && Cube_colors[3][0] == 3){
			
			 redClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[2][0] != 3 && Cube_colors[2][2] != 3 && Cube_colors[2][6] != 3 && Cube_colors[2][8] == 3 && Cube_colors[4][2] == 3 ){
				
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
		 }
		 
		 else if (Cube_colors[2][0] == 3 && Cube_colors[2][2] != 3 && Cube_colors[2][6] != 3 && Cube_colors[2][8] != 3 && Cube_colors[1][8] == 3 ){
				
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[2][0] == 3 && Cube_colors[2][2] != 3 && Cube_colors[2][6] == 3 && Cube_colors[2][8] != 3 && Cube_colors[5][8] == 3 ){
				
			 orangeCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 redClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 redCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[2][1] == 3 && Cube_colors[2][7] == 3 && Cube_colors[2][3] != 3 ){
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
			 
		 }
		 
		 
		 else  if (Cube_colors[2][4] == 3 && Cube_colors[2][1] != 3 && Cube_colors[2][5] != 3 && Cube_colors[2][7] != 3 && Cube_colors[2][3] != 3 ){
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
			 
		 } 
	 }
	 public static void yellowCross(int Cube_colors[][]) {
	   		
		 if (Cube_colors[2][3] == 3 && Cube_colors[2][1] == 3 && Cube_colors[2][5] != 3 ){
			
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else if (Cube_colors[2][1] == 3 && Cube_colors[2][5] == 3 && Cube_colors[2][7] != 3 ){
			 yellowCounterClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[2][5] == 3 && Cube_colors[2][7] == 3 && Cube_colors[2][3] != 3 ){
			 yellowClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 
		 else if (Cube_colors[2][7] == 3 && Cube_colors[2][3] == 3 && Cube_colors[2][1] != 3 ){
			 
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
		 }
		 else  if (Cube_colors[2][3] == 3 && Cube_colors[2][5] == 3 && Cube_colors[2][1] != 3 ){
			 
			 greenClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
			 
		 }
		 else  if (Cube_colors[2][1] == 3 && Cube_colors[2][7] == 3 && Cube_colors[2][3] != 3 ){
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
			 
		 }
		 
		 
		 else  if (Cube_colors[2][4] == 3 && Cube_colors[2][1] != 3 && Cube_colors[2][5] != 3 && Cube_colors[2][7] != 3 && Cube_colors[2][3] != 3 ){
			 
			 greenClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 greenClockWise(Cube_colors);
			 orangeClockWise(Cube_colors);
			 yellowClockWise(Cube_colors);
			 orangeCounterClockWise(Cube_colors);
			 yellowCounterClockWise(Cube_colors);
			 greenCounterClockWise(Cube_colors);
			 
			 
		 } 
	 }
	 
	 public static int[][] whiteClockWise(int colors[][]){
		int[][] colorChange = new int[6][10];
		
		 colorChange[0][0] = colors[0][0];
		 colorChange[0][1] = colors[0][1];
		 colorChange[0][2] = colors[0][2];
		 colorChange[0][3] = colors[0][3];
		 colorChange[0][4] = colors[0][4];
		 colorChange[0][5] = colors[0][5];
		 colorChange[0][6] = colors[0][6];
		 colorChange[0][7] = colors[0][7];
		 colorChange[0][8] = colors[0][8];
		
		 		colors[0][0] = colorChange[0][6];
				colors[0][1] = colorChange[0][3];
				colors[0][2] = colorChange[0][0];
				colors[0][3] = colorChange[0][7];
		        colors[0][4] = colorChange[0][4];
		        colors[0][5] = colorChange[0][1];
		        colors[0][6] = colorChange[0][8];
		        colors[0][7] = colorChange[0][5];
		        colors[0][8] = colorChange[0][2];
		
		        colorChange[0][0] = colors[1][0];
		        colorChange[0][1] = colors[1][3];
		        colorChange[0][2] = colors[1][6];
		        colorChange[0][3] = colors[3][2];
		        colorChange[0][4] = colors[3][5];
		        colorChange[0][5] = colors[3][8];
		        colorChange[0][6] = colors[4][0];
		        colorChange[0][7] = colors[4][3];
		        colorChange[0][8] = colors[4][6];
		        colorChange[1][0] = colors[5][0];
		        colorChange[1][1] = colors[5][3];
		        colorChange[1][2] = colors[5][6];
				
		colors[1][0] = colorChange[0][6];
		colors[1][3] = colorChange[0][7];
		colors[1][6] = colorChange[0][8];
		colors[3][2] = colorChange[1][2];
		colors[3][5] = colorChange[1][1];
		colors[3][8] = colorChange[1][0];
		colors[4][0] = colorChange[0][5];
		colors[4][3] = colorChange[0][4];
	    colors[4][6] = colorChange[0][3];
	    colors[5][0] = colorChange[0][0];
		colors[5][3] = colorChange[0][1];
	    colors[5][6] = colorChange[0][2];
		
		
		
		System.out.println("White ClockWise");
		solutionCommands.add(new FaceCommand(Color.White, true));
		faceController.performOperation(Color.White, true);

		return colors;
	 }
	 public static int[][] whiteCounterClockWise(int colors[][]){
			int[][] colorChange = new int[6][10];
			
			 colorChange[0][0] = colors[0][0];
			 colorChange[0][1] = colors[0][1];
			 colorChange[0][2] = colors[0][2];
			 colorChange[0][3] = colors[0][3];
			 colorChange[0][4] = colors[0][4];
			 colorChange[0][5] = colors[0][5];
			 colorChange[0][6] = colors[0][6];
			 colorChange[0][7] = colors[0][7];
			 colorChange[0][8] = colors[0][8];
			
			 		colors[0][0] = colorChange[0][2];
					colors[0][1] = colorChange[0][5];
					colors[0][2] = colorChange[0][8];
					colors[0][3] = colorChange[0][1];
			        colors[0][4] = colorChange[0][4];
			        colors[0][5] = colorChange[0][7];
			        colors[0][6] = colorChange[0][0];
			        colors[0][7] = colorChange[0][3];
			        colors[0][8] = colorChange[0][6];
			
			        colorChange[0][0] = colors[1][0];
					 colorChange[0][1] = colors[1][3];
					 colorChange[0][2] = colors[1][6];
					 colorChange[0][3] = colors[3][2];
					 colorChange[0][4] = colors[3][5];
					 colorChange[0][5] = colors[3][8];
					 colorChange[0][6] = colors[4][0];
					 colorChange[0][7] = colors[4][3];
					 colorChange[0][8] = colors[4][6];
					 colorChange[1][0] = colors[5][0];
					 colorChange[1][1] = colors[5][3];
					 colorChange[1][2] = colors[5][6];
					
			colors[1][0] = colorChange[1][0];
			colors[1][3] = colorChange[1][1];
			colors[1][6] = colorChange[1][2];
			colors[3][2] = colorChange[0][8];
			colors[3][5] = colorChange[0][7];
			colors[3][8] = colorChange[0][6];
			colors[4][0] = colorChange[0][0];
			colors[4][3] = colorChange[0][1];
		    colors[4][6] = colorChange[0][2];
		    colors[5][0] = colorChange[0][5];
			colors[5][3] = colorChange[0][4];
		    colors[5][6] = colorChange[0][3];
			
			
			
			System.out.println("White Counter ClockWise");
			solutionCommands.add(new FaceCommand(Color.White, false));
			faceController.performOperation(Color.White, false);

			return colors;
		 }
	 public static int[][] redClockWise(int colors[][]){
			int[][] colorChange = new int[6][10];
			
			 colorChange[0][0] = colors[1][0];
			 colorChange[0][1] = colors[1][1];
			 colorChange[0][2] = colors[1][2];
			 colorChange[0][3] = colors[1][3];
			 colorChange[0][4] = colors[1][4];
			 colorChange[0][5] = colors[1][5];
			 colorChange[0][6] = colors[1][6];
			 colorChange[0][7] = colors[1][7];
			 colorChange[0][8] = colors[1][8];
			
			 		colors[1][0] = colorChange[0][6];
					colors[1][1] = colorChange[0][3];
					colors[1][2] = colorChange[0][0];
					colors[1][3] = colorChange[0][7];
			        colors[1][4] = colorChange[0][4];
			        colors[1][5] = colorChange[0][1];
			        colors[1][6] = colorChange[0][8];
			        colors[1][7] = colorChange[0][5];
			        colors[1][8] = colorChange[0][2];
			
			         colorChange[0][0] = colors[0][2];
					 colorChange[0][1] = colors[0][5];
					 colorChange[0][2] = colors[0][8];
					 colorChange[0][3] = colors[2][0];
					 colorChange[0][4] = colors[2][3];
					 colorChange[0][5] = colors[2][6];
					 colorChange[0][6] = colors[4][6];
					 colorChange[0][7] = colors[4][7];
					 colorChange[0][8] = colors[4][8];
					 colorChange[0][9] = colors[5][0];
					 colorChange[1][0] = colors[5][1];
					 colorChange[1][1] = colors[5][2];
			
			colors[0][2] = colorChange[0][9];
			colors[0][5] = colorChange[1][0];
			colors[0][8] = colorChange[1][1];
			colors[2][0] = colorChange[0][6];
			colors[2][3] = colorChange[0][7];
			colors[2][6] = colorChange[0][8];
			colors[4][6] = colorChange[0][2];
			colors[4][7] = colorChange[0][1];
		    colors[4][8] = colorChange[0][0];
		    colors[5][0] = colorChange[0][5];
			colors[5][1] = colorChange[0][4];
		    colors[5][2] = colorChange[0][3];
			
		   
			
			
			
			System.out.println("Red ClockWise");
			solutionCommands.add(new FaceCommand(Color.Red, true));
			faceController.performOperation(Color.Red, true);

			return colors;
		 }
	 public static int[][] redCounterClockWise(int colors[][]){
		 int[][] colorChange = new int[6][10];
			
		 colorChange[0][0] = colors[1][0];
		 colorChange[0][1] = colors[1][1];
		 colorChange[0][2] = colors[1][2];
		 colorChange[0][3] = colors[1][3];
		 colorChange[0][4] = colors[1][4];
		 colorChange[0][5] = colors[1][5];
		 colorChange[0][6] = colors[1][6];
		 colorChange[0][7] = colors[1][7];
		 colorChange[0][8] = colors[1][8];
		
		 		colors[1][0] = colorChange[0][2];
				colors[1][1] = colorChange[0][5];
				colors[1][2] = colorChange[0][8];
				colors[1][3] = colorChange[0][1];
		        colors[1][4] = colorChange[0][4];
		        colors[1][5] = colorChange[0][7];
		        colors[1][6] = colorChange[0][0];
		        colors[1][7] = colorChange[0][3];
		        colors[1][8] = colorChange[0][6];
		
		        colorChange[0][0] = colors[0][2];
				 colorChange[0][1] = colors[0][5];
				 colorChange[0][2] = colors[0][8];
				 colorChange[0][3] = colors[2][0];
				 colorChange[0][4] = colors[2][3];
				 colorChange[0][5] = colors[2][6];
				 colorChange[0][6] = colors[4][6];
				 colorChange[0][7] = colors[4][7];
				 colorChange[0][8] = colors[4][8];
				 colorChange[0][9] = colors[5][0];
				 colorChange[1][0] = colors[5][1];
				 colorChange[1][1] = colors[5][2];
		
		colors[0][2] = colorChange[0][8];
		colors[0][5] = colorChange[0][7];
		colors[0][8] = colorChange[0][6];
		colors[2][0] = colorChange[1][1];
		colors[2][3] = colorChange[1][0];
		colors[2][6] = colorChange[0][9];
		colors[4][6] = colorChange[0][3];
		colors[4][7] = colorChange[0][4];
	    colors[4][8] = colorChange[0][5];
	    colors[5][0] = colorChange[0][0];
		colors[5][1] = colorChange[0][1];
	    colors[5][2] = colorChange[0][2];
		
		
		
		System.out.println("Red CounterClockWise");
		solutionCommands.add(new FaceCommand(Color.Red, false));
		faceController.performOperation(Color.Red, false);

		return colors;
	 }
	 public static int[][] yellowClockWise(int colors[][]){
			int[][] colorChange = new int[6][10];
			
			 colorChange[0][0] = colors[2][0];
			 colorChange[0][1] = colors[2][1];
			 colorChange[0][2] = colors[2][2];
			 colorChange[0][3] = colors[2][3];
			 colorChange[0][4] = colors[2][4];
			 colorChange[0][5] = colors[2][5];
			 colorChange[0][6] = colors[2][6];
			 colorChange[0][7] = colors[2][7];
			 colorChange[0][8] = colors[2][8];
			
			 		colors[2][0] = colorChange[0][6];
					colors[2][1] = colorChange[0][3];
					colors[2][2] = colorChange[0][0];
					colors[2][3] = colorChange[0][7];
			        colors[2][4] = colorChange[0][4];
			        colors[2][5] = colorChange[0][1];
			        colors[2][6] = colorChange[0][8];
			        colors[2][7] = colorChange[0][5];
			        colors[2][8] = colorChange[0][2];
			
			        colorChange[0][0] = colors[1][2];
			        colorChange[0][1] = colors[1][5];
			        colorChange[0][2] = colors[1][8];
			        colorChange[0][3] = colors[3][0];
			        colorChange[0][4] = colors[3][3];
			        colorChange[0][5] = colors[3][6];
			        colorChange[0][6] = colors[4][8];
			        colorChange[0][7] = colors[4][5];
			        colorChange[0][8] = colors[4][2];
			        colorChange[1][0] = colors[5][2];
			        colorChange[1][1] = colors[5][5];
			        colorChange[1][2] = colors[5][8];
					
			colors[1][2] = colorChange[1][0];
			colors[1][5] = colorChange[1][1];
			colors[1][8] = colorChange[1][2];
			colors[3][0] = colorChange[0][6];
			colors[3][3] = colorChange[0][7];
			colors[3][6] = colorChange[0][8];
			colors[4][8] = colorChange[0][2];
			colors[4][5] = colorChange[0][1];
		    colors[4][2] = colorChange[0][0];
		    colors[5][2] = colorChange[0][5];
			colors[5][5] = colorChange[0][4];
		    colors[5][8] = colorChange[0][3];
		    System.out.println("Yellow ClockWise");
			solutionCommands.add(new FaceCommand(Color.Yellow, true));
			faceController.performOperation(Color.Yellow, true);

		    return colors;
	 }
	 public static int[][] yellowCounterClockWise(int colors[][]){
		 int[][] colorChange = new int[6][10];
			
		 colorChange[0][0] = colors[2][0];
		 colorChange[0][1] = colors[2][1];
		 colorChange[0][2] = colors[2][2];
		 colorChange[0][3] = colors[2][3];
		 colorChange[0][4] = colors[2][4];
		 colorChange[0][5] = colors[2][5];
		 colorChange[0][6] = colors[2][6];
		 colorChange[0][7] = colors[2][7];
		 colorChange[0][8] = colors[2][8];
		
		 		colors[2][0] = colorChange[0][2];
				colors[2][1] = colorChange[0][5];
				colors[2][2] = colorChange[0][8];
				colors[2][3] = colorChange[0][1];
		        colors[2][4] = colorChange[0][4];
		        colors[2][5] = colorChange[0][7];
		        colors[2][6] = colorChange[0][0];
		        colors[2][7] = colorChange[0][3];
		        colors[2][8] = colorChange[0][6];
		
		        colorChange[0][0] = colors[1][2];
		        colorChange[0][1] = colors[1][5];
		        colorChange[0][2] = colors[1][8];
		        colorChange[0][3] = colors[3][0];
		        colorChange[0][4] = colors[3][3];
		        colorChange[0][5] = colors[3][6];
		        colorChange[0][6] = colors[4][8];
		        colorChange[0][7] = colors[4][5];
		        colorChange[0][8] = colors[4][2];
		        colorChange[1][0] = colors[5][2];
		        colorChange[1][1] = colors[5][5];
		        colorChange[1][2] = colors[5][8];
				
		colors[1][2] = colorChange[0][8];
		colors[1][5] = colorChange[0][7];
		colors[1][8] = colorChange[0][6];
		colors[3][0] = colorChange[1][2];
		colors[3][3] = colorChange[1][1];
		colors[3][6] = colorChange[1][0];
		colors[4][8] = colorChange[0][3];
		colors[4][5] = colorChange[0][4];
	    colors[4][2] = colorChange[0][5];
	    colors[5][2] = colorChange[0][0];
		colors[5][5] = colorChange[0][1];
	    colors[5][8] = colorChange[0][2];
	    System.out.println("Yellow CounterClockWise");
		solutionCommands.add(new FaceCommand(Color.Yellow, false));
		faceController.performOperation(Color.Yellow, false);

	    return colors;
	 }
	 public static int[][] orangeClockWise(int colors[][]){
			int[][] colorChange = new int[6][10];
			
			 colorChange[0][0] = colors[3][0];
			 colorChange[0][1] = colors[3][1];
			 colorChange[0][2] = colors[3][2];
			 colorChange[0][3] = colors[3][3];
			 colorChange[0][4] = colors[3][4];
			 colorChange[0][5] = colors[3][5];
			 colorChange[0][6] = colors[3][6];
			 colorChange[0][7] = colors[3][7];
			 colorChange[0][8] = colors[3][8];
			
			 		colors[3][0] = colorChange[0][6];
					colors[3][1] = colorChange[0][3];
					colors[3][2] = colorChange[0][0];
					colors[3][3] = colorChange[0][7];
			        colors[3][4] = colorChange[0][4];
			        colors[3][5] = colorChange[0][1];
			        colors[3][6] = colorChange[0][8];
			        colors[3][7] = colorChange[0][5];
			        colors[3][8] = colorChange[0][2];
	
			        colorChange[0][0] = colors[0][0];
			        colorChange[0][1] = colors[0][3];
			        colorChange[0][2] = colors[0][6];
			        colorChange[0][3] = colors[2][2];
			        colorChange[0][4] = colors[2][5];
			        colorChange[0][5] = colors[2][8];
			        colorChange[0][6] = colors[4][0];
			        colorChange[0][7] = colors[4][1];
			        colorChange[0][8] = colors[4][2];
			        colorChange[1][0] = colors[5][6];
			        colorChange[1][1] = colors[5][7];
			        colorChange[1][2] = colors[5][8];
					
			colors[0][0] = colorChange[0][8];
			colors[0][3] = colorChange[0][7];
			colors[0][6] = colorChange[0][6];
			colors[2][2] = colorChange[1][2];
			colors[2][5] = colorChange[1][1];
			colors[2][8] = colorChange[1][0];
			colors[4][0] = colorChange[0][3];
			colors[4][1] = colorChange[0][4];
		    colors[4][2] = colorChange[0][5];
		    colors[5][6] = colorChange[0][0];
			colors[5][7] = colorChange[0][1];
		    colors[5][8] = colorChange[0][2];
		    System.out.println("Orange ClockWise");
			solutionCommands.add(new FaceCommand(Color.Orange, true));
			faceController.performOperation(Color.Orange, true);

		    return colors;
	 }
	 public static int[][] orangeCounterClockWise(int colors[][]){
		 int[][] colorChange = new int[6][10];
			
		 colorChange[0][0] = colors[3][0];
		 colorChange[0][1] = colors[3][1];
		 colorChange[0][2] = colors[3][2];
		 colorChange[0][3] = colors[3][3];
		 colorChange[0][4] = colors[3][4];
		 colorChange[0][5] = colors[3][5];
		 colorChange[0][6] = colors[3][6];
		 colorChange[0][7] = colors[3][7];
		 colorChange[0][8] = colors[3][8];
		
		 		colors[3][0] = colorChange[0][2];
				colors[3][1] = colorChange[0][5];
				colors[3][2] = colorChange[0][8];
				colors[3][3] = colorChange[0][1];
		        colors[3][4] = colorChange[0][4];
		        colors[3][5] = colorChange[0][7];
		        colors[3][6] = colorChange[0][0];
		        colors[3][7] = colorChange[0][3];
		        colors[3][8] = colorChange[0][6];
	
		        colorChange[0][0] = colors[0][0];
		        colorChange[0][1] = colors[0][3];
		        colorChange[0][2] = colors[0][6];
		        colorChange[0][3] = colors[2][2];
		        colorChange[0][4] = colors[2][5];
		        colorChange[0][5] = colors[2][8];
		        colorChange[0][6] = colors[4][0];
		        colorChange[0][7] = colors[4][1];
		        colorChange[0][8] = colors[4][2];
		        colorChange[1][0] = colors[5][6];
		        colorChange[1][1] = colors[5][7];
		        colorChange[1][2] = colors[5][8];
				
		colors[0][0] = colorChange[1][0];
		colors[0][3] = colorChange[1][1];
		colors[0][6] = colorChange[1][2];
		colors[2][2] = colorChange[0][6];
		colors[2][5] = colorChange[0][7];
		colors[2][8] = colorChange[0][8];
		colors[4][0] = colorChange[0][2];
		colors[4][1] = colorChange[0][1];
	    colors[4][2] = colorChange[0][0];
	    colors[5][6] = colorChange[0][5];
		colors[5][7] = colorChange[0][4];
	    colors[5][8] = colorChange[0][3];
	    System.out.println("Orange CounterClockWise");
		solutionCommands.add(new FaceCommand(Color.Orange, false));
		faceController.performOperation(Color.Orange, false);

	    return colors;
	 }
	 public static int[][] blueClockWise(int colors[][]){
			int[][] colorChange = new int[6][10];
			
			 colorChange[0][0] = colors[4][0];
			 colorChange[0][1] = colors[4][1];
			 colorChange[0][2] = colors[4][2];
			 colorChange[0][3] = colors[4][3];
			 colorChange[0][4] = colors[4][4];
			 colorChange[0][5] = colors[4][5];
			 colorChange[0][6] = colors[4][6];
			 colorChange[0][7] = colors[4][7];
			 colorChange[0][8] = colors[4][8];
			
			 		colors[4][0] = colorChange[0][6];
					colors[4][1] = colorChange[0][3];
					colors[4][2] = colorChange[0][0];
					colors[4][3] = colorChange[0][7];
			        colors[4][4] = colorChange[0][4];
			        colors[4][5] = colorChange[0][1];
			        colors[4][6] = colorChange[0][8];
			        colors[4][7] = colorChange[0][5];
			        colors[4][8] = colorChange[0][2];
	
			        colorChange[0][0] = colors[0][0];
			        colorChange[0][1] = colors[0][1];
			        colorChange[0][2] = colors[0][2];
			        colorChange[0][3] = colors[1][0];
			        colorChange[0][4] = colors[1][1];
			        colorChange[0][5] = colors[1][2];
			        colorChange[0][6] = colors[2][0];
			        colorChange[0][7] = colors[2][1];
			        colorChange[0][8] = colors[2][2];
			        colorChange[1][0] = colors[3][0];
			        colorChange[1][1] = colors[3][1];
			        colorChange[1][2] = colors[3][2];
					
			colors[0][0] = colorChange[0][3];
			colors[0][1] = colorChange[0][4];
			colors[0][2] = colorChange[0][5];
			colors[1][0] = colorChange[0][6];
			colors[1][1] = colorChange[0][7];
			colors[1][2] = colorChange[0][8];
			colors[2][0] = colorChange[1][0];
			colors[2][1] = colorChange[1][1];
		    colors[2][2] = colorChange[1][2];
		    colors[3][0] = colorChange[0][0];
			colors[3][1] = colorChange[0][1];
		    colors[3][2] = colorChange[0][2];
		    System.out.println("Blue ClockWise");
			solutionCommands.add(new FaceCommand(Color.Blue, true));
			faceController.performOperation(Color.Blue, true);

		    return colors;
	 }
	 public static int[][] blueCounterClockWise(int colors[][]){
		 int[][] colorChange = new int[6][10];
			//Start here
		 colorChange[0][0] = colors[4][0];
		 colorChange[0][1] = colors[4][1];
		 colorChange[0][2] = colors[4][2];
		 colorChange[0][3] = colors[4][3];
		 colorChange[0][4] = colors[4][4];
		 colorChange[0][5] = colors[4][5];
		 colorChange[0][6] = colors[4][6];
		 colorChange[0][7] = colors[4][7];
		 colorChange[0][8] = colors[4][8];
		
		 		colors[4][0] = colorChange[0][2];
				colors[4][1] = colorChange[0][5];
				colors[4][2] = colorChange[0][8];
				colors[4][3] = colorChange[0][1];
		        colors[4][4] = colorChange[0][4];
		        colors[4][5] = colorChange[0][7];
		        colors[4][6] = colorChange[0][0];
		        colors[4][7] = colorChange[0][3];
		        colors[4][8] = colorChange[0][6];

		        colorChange[0][0] = colors[0][0];
		        colorChange[0][1] = colors[0][1];
		        colorChange[0][2] = colors[0][2];
		        colorChange[0][3] = colors[1][0];
		        colorChange[0][4] = colors[1][1];
		        colorChange[0][5] = colors[1][2];
		        colorChange[0][6] = colors[2][0];
		        colorChange[0][7] = colors[2][1];
		        colorChange[0][8] = colors[2][2];
		        colorChange[1][0] = colors[3][0];
		        colorChange[1][1] = colors[3][1];
		        colorChange[1][2] = colors[3][2];
				
		colors[0][0] = colorChange[1][0];
		colors[0][1] = colorChange[1][1];
		colors[0][2] = colorChange[1][2];
		colors[1][0] = colorChange[0][0];
		colors[1][1] = colorChange[0][1];
		colors[1][2] = colorChange[0][2];
		colors[2][0] = colorChange[0][3];
		colors[2][1] = colorChange[0][4];
	    colors[2][2] = colorChange[0][5];
	    colors[3][0] = colorChange[0][6];
		colors[3][1] = colorChange[0][7];
	    colors[3][2] = colorChange[0][8];
	    System.out.println("Blue CounterClockWise");
		solutionCommands.add(new FaceCommand(Color.Blue, false));
		faceController.performOperation(Color.Blue, false);

	    return colors;
	 }
	 public static int[][] greenClockWise(int colors[][]){
			int[][] colorChange = new int[6][10];
			
			 colorChange[0][0] = colors[5][0];
			 colorChange[0][1] = colors[5][1];
			 colorChange[0][2] = colors[5][2];
			 colorChange[0][3] = colors[5][3];
			 colorChange[0][4] = colors[5][4];
			 colorChange[0][5] = colors[5][5];
			 colorChange[0][6] = colors[5][6];
			 colorChange[0][7] = colors[5][7];
			 colorChange[0][8] = colors[5][8];
			
			 		colors[5][0] = colorChange[0][6];
					colors[5][1] = colorChange[0][3];
					colors[5][2] = colorChange[0][0];
					colors[5][3] = colorChange[0][7];
			        colors[5][4] = colorChange[0][4];
			        colors[5][5] = colorChange[0][1];
			        colors[5][6] = colorChange[0][8];
			        colors[5][7] = colorChange[0][5];
			        colors[5][8] = colorChange[0][2];
		
			        colorChange[0][0] = colors[0][6];
			        colorChange[0][1] = colors[0][7];
			        colorChange[0][2] = colors[0][8];
			        colorChange[0][3] = colors[1][6];
			        colorChange[0][4] = colors[1][7];
			        colorChange[0][5] = colors[1][8];
			        colorChange[0][6] = colors[2][6];
			        colorChange[0][7] = colors[2][7];
			        colorChange[0][8] = colors[2][8];
			        colorChange[1][0] = colors[3][6];
			        colorChange[1][1] = colors[3][7];
			        colorChange[1][2] = colors[3][8];
					
			colors[0][6] = colorChange[1][0];
			colors[0][7] = colorChange[1][1];
			colors[0][8] = colorChange[1][2];
			colors[1][6] = colorChange[0][0];
			colors[1][7] = colorChange[0][1];
			colors[1][8] = colorChange[0][2];
			colors[2][6] = colorChange[0][3];
			colors[2][7] = colorChange[0][4];
		    colors[2][8] = colorChange[0][5];
		    colors[3][6] = colorChange[0][6];
			colors[3][7] = colorChange[0][7];
		    colors[3][8] = colorChange[0][8];
		    System.out.println("Green Clockwise");
			solutionCommands.add(new FaceCommand(Color.Green, true));
			faceController.performOperation(Color.Green, true);

		    return colors;
	 }
	 public static int[][] greenCounterClockWise(int colors[][]){
		 int[][] colorChange = new int[6][10];
			//Start here
		 colorChange[0][0] = colors[5][0];
		 colorChange[0][1] = colors[5][1];
		 colorChange[0][2] = colors[5][2];
		 colorChange[0][3] = colors[5][3];
		 colorChange[0][4] = colors[5][4];
		 colorChange[0][5] = colors[5][5];
		 colorChange[0][6] = colors[5][6];
		 colorChange[0][7] = colors[5][7];
		 colorChange[0][8] = colors[5][8];
		
		 		colors[5][0] = colorChange[0][2];
				colors[5][1] = colorChange[0][5];
				colors[5][2] = colorChange[0][8];
				colors[5][3] = colorChange[0][1];
		        colors[5][4] = colorChange[0][4];
		        colors[5][5] = colorChange[0][7];
		        colors[5][6] = colorChange[0][0];
		        colors[5][7] = colorChange[0][3];
		        colors[5][8] = colorChange[0][6];
	
	
		        colorChange[0][0] = colors[0][6];
		        colorChange[0][1] = colors[0][7];
		        colorChange[0][2] = colors[0][8];
		        colorChange[0][3] = colors[1][6];
		        colorChange[0][4] = colors[1][7];
		        colorChange[0][5] = colors[1][8];
		        colorChange[0][6] = colors[2][6];
		        colorChange[0][7] = colors[2][7];
		        colorChange[0][8] = colors[2][8];
		        colorChange[1][0] = colors[3][6];
		        colorChange[1][1] = colors[3][7];
		        colorChange[1][2] = colors[3][8];
				
		colors[0][6] = colorChange[0][3];
		colors[0][7] = colorChange[0][4];
		colors[0][8] = colorChange[0][5];
		colors[1][6] = colorChange[0][6];
		colors[1][7] = colorChange[0][7];
		colors[1][8] = colorChange[0][8];
		colors[2][6] = colorChange[1][0];
		colors[2][7] = colorChange[1][1];
	    colors[2][8] = colorChange[1][2];
	    colors[3][6] = colorChange[0][0];
		colors[3][7] = colorChange[0][1];
	    colors[3][8] = colorChange[0][2];
	    System.out.println("Green CounterClockwise");
		solutionCommands.add(new FaceCommand(Color.Green, false));
		faceController.performOperation(Color.Green, false);

	    return colors;
	 }
	 
	 public static void printSolutionCommands() {
		 for (FaceCommand elt : solutionCommands) {
			 elt.print();
			 System.out.println(" ");
		 }
	 }

	public class Cube_colors{
		
	}
}
// [5][5] = data.nextInt();