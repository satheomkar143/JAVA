package assignment3;

import java.util.Scanner;

public class Subsets {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = input.nextLine();
		input.close();

		for(int i=0;i<str.length();i++) {
			for(int j=i;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}
}
