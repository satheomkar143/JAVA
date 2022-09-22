import java.util.Scanner;

class Car {
	private int modelNo;
	String carName;
	double price;

	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter model number: ");
		modelNo = input.nextInt();
		System.out.print("Enter car name: ");
		carName = input.next();
		System.out.print("Enter price: ");
		price = input.nextDouble();
	}

	void display() {
		System.out.println(modelNo + "\t" + carName + "\t" + price);
	}
}

public class Vehicle {
	public static void main(String[] args) {
		Car[] c1 = new Car[3];

		for (int i = 0; i < 3; i++) {
			c1[i] = new Car();
		}
		for (int i = 0; i < 3; i++) {
			c1[i].accept();
		}
		System.out.println("ModelNo\tName\tPrice");
		for (int i = 0; i < 3; i++) {
			c1[i].display();
		}
	}
}
