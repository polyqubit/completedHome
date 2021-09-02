import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Rectangle mov = new Rectangle(70,50,100,50);
		mov.draw();
		mov.fill();
		
		int notAForLoop = 0;
		while(notAForLoop < 100) {
			mov.translate(3.0,0.0);
			Canvas.pause(10);
			notAForLoop++;
		}
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
