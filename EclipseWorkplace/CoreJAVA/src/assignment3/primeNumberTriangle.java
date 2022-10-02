package assignment3;

import java.util.Scanner;

public class primeNumberTriangle {

	static int num = 2;

	public static int Prime() {
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			return num++;
			
		} else {
			num++;
			return Prime();
		}
	}

	public static void main(String[] args) {
		int i, j, row, n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows of triangle: ");
		row = input.nextInt();

		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				n = Prime();
				System.out.print(n + "\t");
			}
			System.out.println();
		}
	}
}
