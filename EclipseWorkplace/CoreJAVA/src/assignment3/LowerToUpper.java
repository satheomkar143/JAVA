package assignment3;

import java.util.Scanner;

public class LowerToUpper {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		input.close();
		String str2 = "";
		int ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch -= 32;
			} 
			str2 += (char) ch;
		}
		System.out.println("converting into uppercase: \n");
		System.out.println(str2);
	}
}
