import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Rectangle randColored = new Rectangle(100,100,150,150);

		while (true) {
			Color randColor = new Color(Canvas.rand(256),Canvas.rand(256),Canvas.rand(256));
			randColored.setColor(randColor);
			randColored.fill();
			Canvas.pause(250);
		}
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
