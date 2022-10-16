package javaIO;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteFIle {
	public static void main(String[] args) throws IOException {
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		PrintWriter p = new PrintWriter(System.out, true);

		p.println("Enter string: ");
		String str = b.readLine();

		byte bi[] = str.getBytes();

		FileOutputStream f = new FileOutputStream("demo.txt");
		f.write(bi);
		f.close();

	}
}
