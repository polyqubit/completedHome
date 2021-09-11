import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Rectangle[] jeff;
		jeff = new Rectangle[100];
		int counter = 0;
		while(counter<jeff.length) {
			jeff[counter] = new Rectangle(counter+40,counter+40,150,150);
			counter++;
		}
		
		counter = 0;
		while(counter<jeff.length) {
			jeff[counter].draw();
			counter++;
			Canvas.pause(30);
		}
		
		carGen bob = new carGen(100,100,100,0,200);
		bob.draw();
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
