import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		//nah
		
		System.out.print("Enter your name:\n");
		EasyReader nameIn = new EasyReader();
		String named = nameIn.readWord();
		System.out.print("\nChoose any number from 1 to 100:\n");
		EasyReader numericIn = new EasyReader();
		String numbered = numericIn.readWord();
		int numbero = Integer.parseInt(numbered);
		
		int c = 0;
		while(c<numbero) {
			System.out.print(named+"\n");
			c++;
		}
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
