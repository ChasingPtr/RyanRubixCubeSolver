
public class redClockWise {
		
			
		
	public static void main(String[] args) throws Exception {
		
		
		SerialTest color= new SerialTest();
		SerialTest.colorInput(Color.Yellow, Color.Blue, Color.Red);
		System.out.println("Starting");

			
			
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
			
		    
		     
		     
		   ArduinoController main = new ArduinoController();
		   if (colors[4][4] == 1 && colors[1][4] == 2){
				FaceController faceController = new FaceController(main, Color.White, Color.Red);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 1 && colors[1][4] == 4){
				FaceController faceController = new FaceController(main, Color.White, Color.Orange);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 1 && colors[1][4] == 5){
				FaceController faceController = new FaceController(main, Color.White, Color.Blue);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 1 && colors[1][4] == 6){
				FaceController faceController = new FaceController(main, Color.White, Color.Green);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 2 && colors[1][4] == 1){
				FaceController faceController = new FaceController(main, Color.Red, Color.White);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 2 && colors[1][4] == 3){
				FaceController faceController = new FaceController(main, Color.Red, Color.Orange);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 2 && colors[1][4] == 5){
				FaceController faceController = new FaceController(main, Color.Red, Color.Blue);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 2 && colors[1][4] == 6){
				FaceController faceController = new FaceController(main, Color.Red, Color.Green);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 3 && colors[1][4] == 2){
				FaceController faceController = new FaceController(main, Color.Yellow, Color.Red);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 3 && colors[1][4] == 4){
				FaceController faceController = new FaceController(main, Color.Yellow, Color.Orange);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 3 && colors[1][4] == 5){
				FaceController faceController = new FaceController(main, Color.Yellow, Color.Blue);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 3 && colors[1][4] == 6){
				FaceController faceController = new FaceController(main, Color.Yellow, Color.Green);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 4 && colors[1][4] == 1){
				FaceController faceController = new FaceController(main, Color.Orange, Color.White);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 4 && colors[1][4] == 3){
				FaceController faceController = new FaceController(main, Color.Orange, Color.Yellow);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 4 && colors[1][4] == 5){
				FaceController faceController = new FaceController(main, Color.Orange, Color.Blue);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 4 && colors[1][4] == 6){
				FaceController faceController = new FaceController(main, Color.Orange, Color.Green);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 5 && colors[1][4] == 1){
				FaceController faceController = new FaceController(main, Color.Blue, Color.White);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 5 && colors[1][4] == 2){
				FaceController faceController = new FaceController(main, Color.Blue, Color.Red);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 5 && colors[1][4] == 3){
				FaceController faceController = new FaceController(main, Color.Blue, Color.Yellow);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 5 && colors[1][4] == 4){
				FaceController faceController = new FaceController(main, Color.Blue, Color.Orange);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 6 && colors[1][4] == 1){
				FaceController faceController = new FaceController(main, Color.Green, Color.White);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 6 && colors[1][4] == 2){
				FaceController faceController = new FaceController(main, Color.Green, Color.Red);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 6 && colors[1][4] == 3){
				FaceController faceController = new FaceController(main, Color.Green, Color.Yellow);
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
			}
			if (colors[4][4] == 6 && colors[1][4] == 4){
				try {Thread.sleep(3000);} catch (InterruptedException ie) {}
				FaceController faceController = new FaceController(main, Color.White, Color.Blue);
				faceController.print();
				         
				faceController.performOperation(Color.Red, /*clockwise=*/ true);
				faceController.print();
					
				main.close();
				
				
			}
			
			
			
			System.out.println("Red ClockWise");
			
			return colors;
		 }
	 
	 

}
