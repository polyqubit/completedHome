import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {
	static Rectangle bob;
	static Text namm;

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		System.out.print("Enter your name: \n");
		EasyReader nameIn = new EasyReader();
		String namename = nameIn.readWord();
		
		bob = new Rectangle(0,50,100,50);
		bob.draw();
		namm = new Text(10,70,namename);
		namm.draw();
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		if(s.equals("d")) {
			bob.translate(5.0,0.0);
			namm.translate(5.0,0.0);
		}
	}
}
