package javaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		PrintWriter p = new PrintWriter(System.out, true);

		// System.out.println("Enter string: ");
		p.println("Enter string: ");
		String str = b.readLine();

		// System.out.println(str);
		p.println(str);

	}
}
