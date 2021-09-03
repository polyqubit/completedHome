import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {
	
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		moverect w = new moverect(0,50,0,200,100,3.0,"1x speed");
		moverect wa = new moverect(0,150,190,200,100,3.0,"2x speed");
		moverect was = new moverect(0,250,90,200,100,3.0,"4x speed");
		Rectangle ss = new Rectangle(0,100,10,10);
		ss.draw();
		
		while(true) {
			w.translation(1.0,0.0);
			wa.translation(2.0,0.0);
			was.translation(4.0,0.0);
			Canvas.pause(10);
			Canvas.getInstance().repaint();
			System.out.print(w.xAxs()+"\n");
			if(w.xAxs() > 400) {
				w.translation(-410.0,0.0);
			}
			if(wa.xAxs() > 400) {
				wa.translation(-410.0,0.0);
			}
			if(was.xAxs() > 400) {
				was.translation(-410.0,0.0);
			}
		}
		
	}
	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}