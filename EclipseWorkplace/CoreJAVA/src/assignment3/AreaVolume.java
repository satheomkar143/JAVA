package assignment3;

import java.lang.Math;

abstract class Shape {
	final float PI = 3.14f;
	protected double area;
	protected double volume;
	protected int rad;
	protected int h;

	void setRadius(int rad) {
		this.rad = rad;
	}

	void setHeight(int h) {
		this.h = h;
	}

	abstract void area();

	abstract void volume();
}

class Sphere extends Shape {
	void area() {
		area = 4 * PI * rad * rad;
		System.out.println("area of sphere: " + area);
	}

	void volume() {
		volume = 4 / 3 * PI * rad * rad * rad;
		System.out.println("volume of sphere: " + volume);
	}

}

class Cone extends Shape {
	void area() {
		area = PI * rad * (rad + Math.sqrt((h * h) + (rad * rad)));
		System.out.println("area of cone: " + area);
	}

	void volume() {
		volume = PI * rad * rad * h / 3;
		System.out.println("volume of cone: " + volume);
	}
}

class Cylinder extends Shape {
	void area() {
		area = 2 * PI * rad * (rad + h);
		System.out.println("area of cylinder: " + area);
	}

	void volume() {
		volume = PI * rad * rad * h;
		System.out.println("volume of cylinder: " + volume);
	}
}

public class AreaVolume {
	public static void main(String[] args) {
		Sphere s = new Sphere();
		s.setRadius(25);
		s.area();
		s.volume();

		Cone c = new Cone();
		c.setRadius(12);
		c.setHeight(30);
		c.area();
		c.volume();

		Cylinder cy = new Cylinder();
		cy.setRadius(10);
		cy.setHeight(20);
		cy.area();
		cy.volume();
	}
}
