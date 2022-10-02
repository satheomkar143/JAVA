package assignment3;

import java.util.Scanner;

public class DuplicateCharacter {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		input.close();
		char[] str1 = str.toCharArray();
		int count;

		System.out.println("duplicate characters: ");
		for (int i = 0; i < str1.length; i++) {
			count = 0;
			if (str1[i] != '@') {
				for (int j = i + 1; j < str1.length; j++) {
					if (str1[i] == str1[j]) {
						count++;
						str1[j] = '@';
					}
				}
				if (count > 0) {
					System.out.print(str1[i] + "\t");
				}
			}
		}
	}
}
