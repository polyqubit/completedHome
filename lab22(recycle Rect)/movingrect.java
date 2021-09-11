import pkg.*;
import java.util.ArrayList;

public abstract class movingrect implements Shape {
	// blatantly ripping off pkg/Rectangle.java
	private int xAA;
	public void moverect(int rectx, int recty, int red, int green, int blue, double speed, String rLabel) {
		xAA = rectx;
		Rectangle x = new Rectangle(rectx,recty,100,40);
		Color ax = new Color(red,green,blue);
		x.setColor(ax);
		Text tex = new Text(rectx+20,recty+15,rLabel);
		x.draw();
		x.fill();
		tex.draw();
	}
	public int xAxs(){
		return (int) Math.round(xAA);
	}
}