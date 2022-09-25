class Circle {
	private double radius;
	String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	Circle(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArea {
	public static void main(String[] args) {
		Circle c = new Circle();

		System.out.println("radius of circle 1: " + c.getRadius());
		System.out.println("Area of circle 1: " + c.getArea());

		Circle c2 = new Circle(5.0);

		System.out.println("radius of circle 2: " + c2.getRadius());
		System.out.println("Area of circle 2: " + c2.getArea());

	}
}
