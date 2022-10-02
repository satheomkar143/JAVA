package assignment3;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		input.close();

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if (reverse.equals(str)) {
			System.out.println("'" + str + "' is a palindrome string");
		} else {
			System.out.println("'" + str + "' is not palindrome string");
		}
	}
}
