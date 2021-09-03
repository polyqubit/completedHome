import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Rectangle x = new Rectangle(0,100,100,40);
		Color ax = new Color(180,50,250);
		x.setColor(ax);
		Text tex = new Text(20,120,"hello");
		x.draw();
		x.fill();
		tex.draw();
		
		double xrect = 0.0;
		while(xrect<400.0) {
			x.translate(1.0,0.0);
			tex.translate(1.0,0.0);
			Canvas.pause(10);
			xrect = x.getX();
		}
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
