package assignment3;

import java.util.Scanner;

class Vehicle {
	private String company;
	private double price;

	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter company name: ");
		company = input.next();
		System.out.println("Enter vehicle price: ");
		price = input.nextDouble();
	}

	public void display() {
		System.out.println("\ncompany name: " + company);
		System.out.println("price: " + price);
	}
}

class LightMotorVehicle extends Vehicle {
	int mileage;

	public void accept() {
		Scanner input = new Scanner(System.in);
		super.accept();
		System.out.println("Enter mileage: ");
		mileage = input.nextInt();
	}

	public void display() {
		super.display();
		System.out.println("mileage: " + mileage);
	}
}

class HeavyMotorVehicle extends Vehicle {
	int capacityInTones;

	public void accept() {
		Scanner input = new Scanner(System.in);
		super.accept();
		System.out.println("Enter capacity in Tones: ");
		capacityInTones = input.nextInt();
	}

	public void display() {
		super.display();
		System.out.println("capacity in Tones: " + capacityInTones);
	}
}

public class MotorVehicle {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("for light vehicle motor press: 1");
		System.out.println("for heavy motor vehicle press: 2");
		n = input.nextInt();
		if (n == 1) {
			LightMotorVehicle l = new LightMotorVehicle();
			l.accept();
			l.display();
		} else if (n == 2) {
			HeavyMotorVehicle h = new HeavyMotorVehicle();
			h.accept();
			h.display();
		} else {
			System.out.println("choose correct option");
		}
	}

}
