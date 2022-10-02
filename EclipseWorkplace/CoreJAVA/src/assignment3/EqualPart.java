package assignment3;

import java.util.Scanner;

public class EqualPart {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		System.out.print("Enter number of parts: ");
		int part = input.nextInt();
		input.close();

		int len = str.length();

		if (len % part == 0) {
			String[] str2 = new String[part];
			int n = len / part;
			for (int i = 0, j = 0; i < part; i++, j = j + n) {
				str2[i] = str.substring(j, j + n);
			}
			for (String s : str2) {
				System.out.println(s);
			}
		} else {
			System.out.println("this string is unable to divide in equal parts");
		}

	}
}
