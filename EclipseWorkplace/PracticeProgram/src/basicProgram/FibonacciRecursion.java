package basicProgram;

import java.util.Scanner;

public class FibonacciRecursion {

	static int n1 = 0, n2 = 1, n3;

	static void fibonacci(int term) {
		if (term > 0) {
			n3 = n1 + n2;
			System.out.print("\t" + n3);
			n1 = n2;
			n2 = n3;
			fibonacci(term - 1);
		}
	}

	public static void main(String[] args) {
		int term;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		term = input.nextInt();
		input.close();
		System.out.println("fibonacci series using recursion: ");
		System.out.print(n1 + "\t" + n2);
		fibonacci(term - 2);
	}
}
