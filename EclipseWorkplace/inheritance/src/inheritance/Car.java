package inheritance;

class Vehicle {
	protected String brand;

	public Vehicle(String b) {
		brand = b;
	}
}

public class Car extends Vehicle {
	private String name;
	private double price;

	public Car(String b, String n, double p) {
		super(b);
		name = n;
		price = p;
	}

	void show() {
		System.out.println("brand = " + brand);
		System.out.println("name = " + name);
		System.out.println("price = " + price);
	}

	public static void main(String[] args) {
		Car obj = new Car("Skoda", "McLaren", 4654656);
		obj.show();
	}
}
