package javaIO;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("demo.txt");

		try {
			int i = f.read();
			while (i != -1) {
				System.out.print((char) i);
				i = f.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			f.close();
		}

	}
}
