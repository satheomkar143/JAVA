package assignment3;

import java.util.Scanner;

public class DuplicateWord {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		input.close();
		int count;

		String[] word = str.split(" ");

		System.out.println("duplicate words: ");
		for (int i = 0; i < word.length; i++) {
			count = 0;
			if (word[i] != "@") {
				for (int j = i + 1; j < word.length; j++) {
					if (word[i].equals(word[j])) {
						count++;
						word[j] = "@";
					}
				}
				if (count > 0) {
					System.out.print(word[i] + "\t");
				}
			}
		}
	}
}
