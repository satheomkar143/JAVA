package inheritance;

class Employee {
	protected int id;
	protected String name;

	public Employee(int i, String n) {
		id = i;
		name = n;
	}
}

public class Department extends Employee {
	private String designation;
	private double salary;

	public Department(int i, String n, String d, double s) {
		super(i, n);
		designation = d;
		salary = s;
	}

	void show() {
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("designation = " + designation);
		System.out.println("salary = " + salary);
	}

	public static void main(String[] args) {
		Department obj = new Department(1, "omkar", "developer", 7896541);
		obj.show();
	}
}
