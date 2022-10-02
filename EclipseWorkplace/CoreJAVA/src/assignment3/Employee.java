package assignment3;

class Person1 {
	private String name;
	private String country;
	private int age;

	public Person1(String name, String country, int age) {
		this.name = name;
		this.country = country;
		this.age = age;
	}

	public void show() {
		System.out.println("name: " + name);
		System.out.println("country: " + country);
		System.out.println("age: " + age);
	}
}

public class Employee extends Person1 {
	double salary;

	public Employee(String name, String country, int age, double salary) {
		super(name, country, age);
		this.salary = salary;
	}

	public void show() {
		super.show();
		System.out.println("salary: " + salary);
	}

	public static void main(String[] args) {
		Employee e = new Employee("Omkar", "India", 25, 500000);
		e.show();
	}

}
