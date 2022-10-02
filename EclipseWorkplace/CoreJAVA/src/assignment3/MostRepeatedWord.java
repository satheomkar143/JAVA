package assignment3;

import java.util.Scanner;

public class MostRepeatedWord {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		input.close();

		int count = 0, max = 0;
		String mostRepeatWord = "";

		String[] str2 = str.split(" ");
		for (int i = 0; i < str2.length; i++) {
			count = 0;
			for (int j = i + 1; j < str2.length; j++) {
				if (str2[i].equals(str2[j])) {
					count++;
				}
			}
			if (count > max) {
				mostRepeatWord = str2[i];
				max = count;
			}
		}
		System.out.println("most repeated word: " + mostRepeatWord);
	}
}
