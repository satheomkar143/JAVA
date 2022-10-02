package assignment3;

import java.util.Scanner;

interface Account {
	float intrest = 7.8f;

	void set(double accNum, double balance);

	void display();
}

interface Person {

	void store(String name);

	void disp();
}

public class Customer implements Account, Person {
	String name;
	double accNum, balance;

	public void set(double accNum, double balance) {
		this.accNum = accNum;
	}

	public void display() {
		System.out.println("account number: " + accNum);
		System.out.println("balance: " + balance);
		System.out.println("interest rate: " + intrest);
	}

	public void store(String name) {
		this.name = name;
	}

	public void disp() {
		System.out.println("name: " + name);
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter customer details: ");
		System.out.print("name: ");
		c.name = input.next();
		System.out.print("account number: ");
		c.accNum = input.nextDouble();
		System.out.print("balance: ");
		c.balance = input.nextDouble();

		System.out.println("\n\nDetails of customer: ");
		c.disp();
		c.display();

	}

}
