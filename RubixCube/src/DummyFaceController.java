
public class DummyFaceController extends FaceController {
	public void performOperation(Color face, boolean turnClockwise) {}
	public DummyFaceController(ArduinoController ardController, Color top, Color front) {
		super(ardController, top, front);
	}
}
