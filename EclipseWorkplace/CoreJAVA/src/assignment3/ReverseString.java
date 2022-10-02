package assignment3;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		input.close();

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println("reverse string : " + reverse);
	}
}
