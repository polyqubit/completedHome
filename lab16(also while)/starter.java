import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		
		// lol no
		
		
		int guessnumber = Canvas.rand(1001);
		boolean guessedBool = false;
		while(guessedBool == false) {
			System.out.print("Number guessing game! Guess the number between 1 and 1000!\n");
			EasyReader guessIn = new EasyReader();
			String guessed = guessIn.readWord();
			int guessint = Integer.parseInt(guessed);
			if(guessint == guessnumber){
				System.out.print("Yes Yes !");
				break;
			}
			else if(guessint < guessnumber){
				System.out.print("Too low! Try !\n\n");				
			}
			else if(guessint > guessnumber){
				System.out.print("Too high! Try !\n\n");
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
