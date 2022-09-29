package abstraction;

abstract class Vehicle {
	abstract void engine();
}

public class Car extends Vehicle {

	void engine() {
		System.out.println("car engine assemble");
	}

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.engine();
		
	}
}
