import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {
	
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		int wtrack;
		int watrack;
		int wastrack;
		int wSpeed = 4;
		int waSpeed = 3;
		int wasSpeed = 5;
		
		moverect w = new moverect(0,0,100,200,100,"speed");
		moverect wa = new moverect(0,100,255,100,100,"vroom");
		moverect was = new moverect(0,200,0,200,100,"teleport");
		
		Line track1 = new Line(0,50,450,50);
		track1.draw();
		Line track2 = new Line(0,150,450,150);
		track2.draw();
		Line track3 = new Line(0,250,450,250);
		track3.draw();
		Line track4 = new Line(0,350,450,350);
		track4.draw();
		Line track5 = new Line(0,450,450,450);
		track5.draw();
		Line track6 = new Line(0,550,450,550);
		track6.draw();
		
		while(true) {
			wtrack = Canvas.rand(5);
			watrack = Canvas.rand(5);
			wastrack = Canvas.rand(5);
			w.translation(wSpeed,0.0);
			wa.translation(waSpeed,0.0);
			was.translation(wasSpeed,0.0);
			Canvas.pause(10);
			Canvas.getInstance().repaint();

			if(w.xAxs() > 400) {
				w.translation(-410.0,0.0);
				wSpeed = Canvas.rand(8)+1;
				switch (wtrack) {case 0: case 4: if(w.yAxs()>10){w.translation(0,-100); break;} break; case 1: break; case 2: case 3: if(w.yAxs()<420){w.translation(0,100); break;} break;}
			}
			if(wa.xAxs() > 400) {
				wa.translation(-410.0,0.0);
				waSpeed = Canvas.rand(8)+1;
				switch (watrack) {case 0: case 4: if(wa.yAxs()>10){wa.translation(0,-100); break;} break; case 1: break; case 2: case 3: if(wa.yAxs()<420){wa.translation(0,100); break;} break;}
			}
			if(was.xAxs() > 400) {
				was.translation(-410.0,0.0);
				wasSpeed = Canvas.rand(8)+1;
				switch (wastrack) {case 0: case 4: if(was.yAxs()>10){was.translation(0,-100); break;} break; case 1: break; case 2: case 3: if(was.yAxs()<420){was.translation(0,100); break;} break;}
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