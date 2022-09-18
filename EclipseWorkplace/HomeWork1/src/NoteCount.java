import java.util.Scanner;

public class NoteCount {
	public static void main(String[] args) {
		int amount;
		int a[] = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Amount: ");
		amount = input.nextInt();

		if (amount >= 2000) {
			a[0] = amount / 2000;
			amount %= 2000;
			System.out.println("Number of 2000 notes: " + a[0]);
		}
		if (amount >= 500) {
			a[1] = amount / 500;
			amount %= 500;
			System.out.println("Number of 500 notes: " + a[1]);
		}
		if (amount >= 200) {
			a[2] = amount / 200;
			amount %= 200;
			System.out.println("Number of 200 notes: " + a[2]);
		}
		if (amount >= 100) {
			a[3] = amount / 100;
			amount %= 100;
			System.out.println("Number of 100 notes: " + a[3]);
		}
		if (amount >= 50) {
			a[4] = amount / 50;
			amount %= 50;
			System.out.println("Number of 50 notes: " + a[4]);
		}
		if (amount >= 20) {
			a[5] = amount / 20;
			amount %= 20;
			System.out.println("Number of 20 notes: " + a[5]);
		}
		if (amount >= 10) {
			a[6] = amount / 10;
			amount %= 10;
			System.out.println("Number of 10 notes: " + a[6]);
		}
		if (amount >= 5) {
			a[7] = amount / 5;
			amount %= 5;
			System.out.println("Number of 5 coins: " + a[7]);
		}
		if (amount >= 2) {
			a[8] = amount / 2;
			amount %= 2;
			System.out.println("Number of 2 coins: " + a[8]);
		}
		if (amount >= 1) {
			a[9] = amount / 1;
			amount %= 1;
			System.out.println("Number of 1 coins: " + a[9]);
		}
	}
}
