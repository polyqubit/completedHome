import pkg.*;
import java.util.ArrayList;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class carGen {
	private Rectangle mainbody;
	private Rectangle cabin;
	private Rectangle window;
	private Ellipse wheela;
	private Ellipse wheelb;
	private Ellipse wheelc;
	
	public carGen(double xa, double ya, int rc, int gc, int bc) {
		mainbody = new Rectangle(xa,ya,60,30);
		Color maincolor = new Color(rc,gc,bc);
		mainbody.setColor(maincolor);
		cabin = new Rectangle(xa+60,ya+10,20,20);
		Color cabcolor = new Color(120,120,120);
		cabin.setColor(cabcolor);
		window = new Rectangle(xa+65,ya+14,10,7);
		Color wincolor = new Color(150,190,255);
		window.setColor(wincolor);
		wheela = new Ellipse(xa+4,ya+27,12,12);
		Color wha = new Color(100,100,100);
		wheela.setColor(wha);
		wheelb = new Ellipse(xa+44,ya+27,12,12);
		wheelb.setColor(wha);
		wheelc = new Ellipse(xa+63,ya+27,12,12);
		wheelc.setColor(wha);
	}
	public void draw() {
		wheela.fill();
		wheelb.fill();
		wheelc.fill();
		mainbody.fill();
		cabin.fill();
		window.fill();
	}
}