package assignment2;

class Member {
	private String name;
	private int age;
	private double phoneNumber;
	private String address;
	private double salary;

	public Member(String name, int age, double phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	public void display() {
		System.out.println("name= " + name);
		System.out.println("age= " + age);
		System.out.println("phone number= " + phoneNumber);
		System.out.println("address= " + address);
	}

	public void printSalary() {
		System.out.println("salary: " + salary);
	}
}

class Employee extends Member {
	private String specilization;

	public Employee(String name, int age, double phoneNumber, String address, double salary, String specilization) {
		super(name, age, phoneNumber, address, salary);
		this.specilization = specilization;
	}

	public void show() {
		display();
		System.out.println("specilization= " + specilization);
	}

}

class Manager extends Member {
	private String department;

	public Manager(String name, int age, double phoneNumber, String address, double salary, String department) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
	}

	public void show() {
		display();
		System.out.println("department= " + department);
	}
}

public class Company {
	public static void main(String[] args) {
		Employee e = new Employee("raj", 20, 7825964125d, "pune", 25000, "developer");
		Manager m = new Manager("omakr", 25, 7058919412d, "kolhapur", 500000, "software department");

		e.show();
		e.printSalary();

		m.show();
		m.printSalary();
	}
}
