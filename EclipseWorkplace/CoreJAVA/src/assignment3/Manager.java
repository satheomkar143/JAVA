package assignment3;

import java.util.Scanner;

class Employee1 {
	private int id;
	private String name;
	private String department;
	protected double salary;

	public Employee1() {
		this.id = 1;
		this.name = "omkar";
		this.department = "developer";
		this.salary = 850000;
	}

	public Employee1(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter id: ");
		id = input.nextInt();
		System.out.print("Enter name: ");
		name = input.next();
		System.out.print("Enter department: ");
		department = input.next();
		System.out.print("Enter salary: ");
		salary = input.nextDouble();
	}

	public void display() {
		System.out.println("\nid = " + id);
		System.out.println("name = " + name);
		System.out.println("department = " + department);
		System.out.println("salary = " + salary);
	}
}

public class Manager extends Employee1 {
	private int bonus;
	private double totalSal;
	Scanner input = new Scanner(System.in);

	public Manager() {
		this.bonus = 1500;
	}

	public Manager(int id, String name, String department, double salary, int bonus) {
		super(id, name, department, salary);
		this.bonus = bonus;
	}

	public void accept() {
		super.accept();
		System.out.print("enter bonus: ");
		bonus = input.nextInt();
	}

	public void display() {
		totalSal = super.salary + bonus;
		super.display();
		System.out.println("bonus = " + bonus);
		System.out.println("total salary = " + totalSal);
	}

	public static void main(String[] args) {
		int i;
		// default constructor
		Manager m1 = new Manager();
		m1.display();

		// parameterized constructor
		Manager m2 = new Manager(10, "raj", "tester", 45000, 1000);
		m2.display();

//		// array of manager
//		Manager[] m = new Manager[5];
//		for (i = 0; i < 5; i++) {
//			m[i] = new Manager();
//			System.out.println("\nEnter details for manager " + (i + 1) + ": ");
//			m[i].accept();
//		}
//		for (i = 0; i < 5; i++) {
//			m[i].display();
//		}
//		int max = 0, index = -1;
//		for (i = 0; i < 5; i++) {
//			m[i].totalSal = m[i].salary + m[i].bonus;
//			if (m[i].totalSal > max) {
//				index = i;
//			}
//		}
//		System.out.println("\ndetails of manager having highest total salary: ");
//		m[index].display();
	}

}
