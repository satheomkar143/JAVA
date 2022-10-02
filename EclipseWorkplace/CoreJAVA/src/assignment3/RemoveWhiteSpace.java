package assignment3;

import java.util.Scanner;

public class RemoveWhiteSpace {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		input.close();
		String str2 = "";

		for (int i = 0, j = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				str2 += str.charAt(i);
			}
		}
		System.out.println("After removing whitesaces: ");
		System.out.println(str2);
	}
}
