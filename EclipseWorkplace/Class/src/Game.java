import java.util.Scanner;

class NumberGuess {
	private int masterNumber = 24;
	int number;
	Scanner input = new Scanner(System.in);

	void play() {

		int choice;
		do {				
			System.out.print("Enter number: ");
			number = input.nextInt();

			if (masterNumber == number) {
				System.out.println("YOU WIN !!!!!");
			} else {
				if (number > masterNumber) {
					System.out.println("too high");
				} else {
					System.out.println("too low");
				}
			}
			
			System.out.println("1: PLAY AGAIN\t0:QUIT");
			choice = input.nextInt();

		} while (choice == 1);
	}
}

public class Game {
	public static void main(String[] args) {
		NumberGuess n = new NumberGuess();
		n.play();
	}
}
