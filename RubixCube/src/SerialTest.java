public class SerialTest {
	static boolean isInitialized = false;
	
	static void printOut(String s) {
		System.out.println(s);
	}
	
	public static void doInitialSetup(ArduinoController main) {
		assert(!isInitialized);
		main.sendTurn();
		isInitialized = false;		
	}
	
	public static void colorInput(Color top, Color front, Color solve) throws InterruptedException{
		ArduinoController main = new ArduinoController();
		main.initialize();
		Thread t=new Thread() {
			public void run() {
				//the following line will keep this app alive for 1000 seconds,
				//waiting for events to occur and responding to them (printing incoming messages to console).
				//try {Thread.sleep(3000);} catch (InterruptedException ie) {}
				try {Thread.sleep(3000);} catch (InterruptedException ie) {}
				if (!isInitialized)
					doInitialSetup(main);
				FaceController faceController = new FaceController(main, top, front);
				faceController.print();
				faceController.performOperation(solve, /*clockwise=*/ true);
				faceController.print();
				
				main.close();
				
			}
			
			
			
			
		};
		t.start();
		t.join();
		main.close();
		System.out.println("Started");
	}
	
	public static void main(String[] args) throws Exception {
		
		printOut("Beginning main");
		
		colorInput(Color.Blue,Color.Red,Color.Red);
	

		//ArduinoController main = new ArduinoController();
		//main.initialize();
		
		//Thread t=new Thread() {
			//public void run() {
				//the following line will keep this app alive for 1000 seconds,
				//waiting for events to occur and responding to them (printing incoming messages to console).
				//try {Thread.sleep(3000);} catch (InterruptedException ie) {}
			//	FaceController faceController = new FaceController(main, Color.Yellow, Color.Blue);
				//faceController.print();
				//faceController.performOperation(Color.Red, /*clockwise=*/ true);
				//faceController.print();
				
				//main.close();
				
			//}
			
		
			
			
		//};
	
		
		
	}
	
	
}
