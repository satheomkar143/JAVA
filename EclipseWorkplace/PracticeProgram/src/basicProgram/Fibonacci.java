package basicProgram;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, term;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		term = input.nextInt();
		input.close();
		System.out.println("fibonacci series: ");
		System.out.print(n1 + "\t" + n2);
		for (int i = 2; i < term; i++) {
			n3 = n1 + n2;
			System.out.print("\t" + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
