package basicProgram;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int i, num, cnt = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = input.nextInt();

		if (num == 0 || num == 1) {
			System.out.println("it is not a prime number");
		} else {
			for (i = 0; i < num / 2; i++) {
				if (num % 2 == 0) {
					cnt = 1;
					System.out.println("it is not a prime number");
					break;
				}
			}
			if (cnt == 0) {
				System.out.println("it is a prime number");
			}
		}
	}

}
