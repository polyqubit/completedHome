import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {
	
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		System.out.print("Enter Rectangle 1 speed(1-15x):\n");
		EasyReader inputSpeed1 = new EasyReader();
		int speed1 = Integer.parseInt(inputSpeed1.readWord());
		System.out.print("Enter Rectangle 2 speed(1-15x):\n");
		EasyReader inputSpeed2 = new EasyReader();
		int speed2 = Integer.parseInt(inputSpeed2.readWord());
		System.out.print("Enter Rectangle 3 speed(1-15x):\n");
		EasyReader inputSpeed3 = new EasyReader();
		int speed3 = Integer.parseInt(inputSpeed3.readWord());
		
		if (speed1<1 || speed1>15) {
			speed1 = 0;
		}
		if (speed2<1 || speed2>15) {
			speed2 = 0;
		}
		if (speed3<1 || speed3>15) {
			speed3 = 0;
		}
		
		moverect w = new moverect(0,50,0,200,100,speed1+"x speed");
		moverect wa = new moverect(0,150,190,200,100,speed2+"x speed");
		moverect was = new moverect(0,250,90,200,100,speed3+"x speed");
		Rectangle ss = new Rectangle(0,100,10,10);
		ss.draw();
		
		while(true) {
			w.translation(speed1,0.0);
			wa.translation(speed2,0.0);
			was.translation(speed3,0.0);
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