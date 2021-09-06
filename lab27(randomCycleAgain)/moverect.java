import pkg.*;
import java.util.ArrayList;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class moverect {
	//may or may not be a ripoff of pkg/Rectangle.java
	private int xAA;
	private int yAA;
	public Rectangle x;
	public Text tex;
	
	public moverect(int xAA, int yAA, int red, int green, int blue, String rLabel) {
		this.xAA = xAA;
		this.yAA = yAA;
		//rectx = xAA;
		//recty = yAA;
		x = new Rectangle(xAA,yAA,50,100);
		Color ax = new Color(red,green,blue);
		x.setColor(ax);
		tex = new Text(xAA+5,yAA+15,rLabel);
		x.draw();
		x.fill();
		tex.draw();
	}
	public int xAxs(){
		return (int) Math.round(xAA);
	}
	public int yAxs(){
		return (int) Math.round(yAA);
	}
	public void translation(double dx, double dy) {
        x.translate(dx,dy);
		tex.translate(dx,dy);
		xAA += dx;
		yAA += dy;
    }
}