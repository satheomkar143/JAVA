package javaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BankBalance {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount to deposit: ");
		int amt = input.nextInt();

		Scanner sc = new Scanner(new File("balance.txt"));
		int currentBalance = sc.nextInt();
		System.out.println("privious balance: " + currentBalance);

		currentBalance += amt;
		System.out.println("updated balance: " + currentBalance);

		FileOutputStream f = new FileOutputStream("balance.txt");
		String str = Integer.toString(currentBalance);
		byte b[] = str.getBytes();
		f.write(b);
		f.close();
	}

}
