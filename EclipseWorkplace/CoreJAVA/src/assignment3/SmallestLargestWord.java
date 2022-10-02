package assignment3;

import java.util.Scanner;

public class SmallestLargestWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		input.close();

		String[] word = str.split(" ");
//		System.out.println(word.length);
//		for (String w : word) {
//			System.out.println(w);
//		}
		int len;
		String small = word[1], large = word[1];
		for (String wd : word) {
			len = wd.length();
			if (small.length() > len) {
				small = wd;
			}
			if (large.length() < len) {
				large = wd;
			}
		}

		System.out.println("smallest word in string: '" + small + "'");
		System.out.println("largest word in the string: '" + large + "'");
	}
}
