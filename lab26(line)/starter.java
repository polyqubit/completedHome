import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Line track1 = new Line(0,20,450,20);
		track1.draw();

		Line track2 = new Line(0,130,450,130);
		track2.draw();

		Line track3 = new Line(0,240,450,240);
		track3.draw();

		Line track4 = new Line(0,350,450,350);
		track4.draw();

		Line track5 = new Line(0,460,450,460);
		track5.draw();

		Line track6 = new Line(0,570,450,570);
		track6.draw();
		
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
