package assignment3;

import java.util.Scanner;

class Rectangle {
	private int length;
	private int breadth;
	private int area;

	public void setValue(int l, int b) {
		this.length = l;
		this.breadth = b;
	}

	public void show() {
		area = length * breadth;
		System.out.println(length + "\t" + breadth + '\t' + area);
	}
}

public class Area {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i, len, bre;
		Rectangle[] r = new Rectangle[3];

		for (i = 0; i < 3; i++) {
			r[i] = new Rectangle();
			System.out.println("Enter length and breadth for rectangle " + (i + 1) + "= ");
			len = input.nextInt();
			bre = input.nextInt();
			r[i].setValue(len, bre);
		}

		System.out.println("length\tbreadth\tarea");
		for (i = 0; i < 3; i++) {
			r[i].show();
		}
	}
}
