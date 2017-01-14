public class SerialTest {
	static boolean isInitialized = false;

	static void printOut(String s) {
		System.out.println(s);
	}

//	public static void doInitialSetup(ArduinoController main) {
//		assert(!isInitialized);
//		main.sendTurn();
//		isInitialized = false;		
//	}

	public static void main(String[] args) throws Exception {
		printOut("Beginning main");

		ArduinoController main = new ArduinoController();
		main.initialize();

		Thread t=new Thread() {
			public void run() {
				//the following line will keep this app alive for 1000 seconds,
				//waiting for events to occur and responding to them (printing incoming messages to console).
				try {Thread.sleep(3000);} catch (InterruptedException ie) {}
				FaceController faceController = new FaceController(main, Color.Yellow, Color.Blue);
				faceController.print();
				
				faceController.flip();
				faceController.flip();
				faceController.flip();
				faceController.hold();				
				faceController.flip();
				faceController.flip();
				faceController.flip();
				faceController.hold();				
				faceController.flip();
				faceController.flip();
				faceController.flip();
				faceController.hold();				
				faceController.flip();
				faceController.flip();
				faceController.flip();
				faceController.hold();				
				faceController.flip();
				faceController.flip();
				faceController.flip();
				faceController.hold();				
				faceController.flip();
				faceController.flip();
				faceController.flip();
				faceController.hold();				
				faceController.flip();
				faceController.flip();
				faceController.flip();
				faceController.hold();
				
				//main.send("I20FFHFFHFFHFFHFFHFFHFF");
				
				faceController.print();
				faceController.commit();

				main.close();

			}
		};

		t.start();
		t.join();
		main.close();
		System.out.println("Started");

	}
}
