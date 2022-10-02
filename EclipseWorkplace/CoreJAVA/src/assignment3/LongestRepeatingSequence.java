package assignment3;

import java.util.Scanner;

public class LongestRepeatingSequence {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		input.close();
		char[] str2 = str.toCharArray();

		int m = 0, count = 0, start = 0, end = 0, maxlength = 0;

		for (int i = 0; i < str2.length; i++) {
			for (int j = i + 1; j < str2.length; j++) {
				if (str2[i] == str2[j]) {
					m = i;
					count = 0;
					for (int k = j; k < str2.length; k++, m++) {
						if (str2[k] == str2[m]) {
							count++;
						} else {
							break;
						}
					}
					if (count > maxlength) {
						maxlength = count;
						start = i;
						end = m;
					}
				}
			}
		}
		System.out.println(start + " " + end);
		System.out.println("repeaat: " + str.substring(start, end));
	}
}
