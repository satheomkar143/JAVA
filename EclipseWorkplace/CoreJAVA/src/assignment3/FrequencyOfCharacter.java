package assignment3;

import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		System.out.print("Enter character to check: ");
		char ch = input.next().charAt(0);
		input.close();

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println("Frequency of '" + ch + "' is " + count);
	}
}
