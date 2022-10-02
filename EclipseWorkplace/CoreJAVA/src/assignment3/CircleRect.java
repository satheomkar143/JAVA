package assignment3;

import java.util.Scanner;

interface shape1 {
	void area();
}

class Circle2 implements shape1 {
	private int rad;
	private double area;

	public void area() {

		Scanner input = new Scanner(System.in);
		System.out.println("enter radius: ");
		rad = input.nextInt();
		area = 3.14 * rad * rad;
	}

	public String toString() {
		return "area of circle = " + area;
	}
}

class rectangle2 implements shape1 {
	private int length, width;
	private double area;

	public void area() {

		Scanner input = new Scanner(System.in);
		System.out.println("enter length and width: ");
		length = input.nextInt();
		width = input.nextInt();
		area = length * width;
	}

	public String toString() {
		return "area of rectangle = " + area;
	}
}

public class CircleRect {
	public static void main(String[] args) {
		Circle2 c = new Circle2();
		c.area();
		System.out.println(c);

		rectangle2 r = new rectangle2();
		r.area();
		System.out.println(r);
	}
}
