import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Rectangle randomParam = new Rectangle(200,200,20,20);
		Color param = new Color(200,0,200);
		randomParam.setColor(param);
		randomParam.draw();
		
		int randoms;
		int randoms2;
		while(true) {
			randoms = (int) Math.floor(20*Math.random())-5;
			randoms2 = (int) Math.floor(20*Math.random())-5;
			//TIL type casting
			randomParam.grow(randoms,randoms2);
			System.out.println("Height of rectangle is "+randomParam.getHeight());
			Canvas.pause(50);
		}
		
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
