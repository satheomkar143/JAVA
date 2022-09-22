import java.util.Scanner;

class Employee {
	private int salary;
	String name;
	int joiningYear;
	String address;

	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = input.next();
		System.out.print("Enter year of joining: ");
		joiningYear = input.nextInt();
		System.out.print("Enter Address: ");
		address = input.next();
		System.out.print("Enter salary: ");
		salary = input.nextInt();
	}

	void display() {
		System.out.println(name + "\t" + joiningYear + "\t\t" + address + "\t" + salary);
	}
}

public class Company {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter number of Employee: ");
		int n=input.nextInt();
		
		Employee[] e=new Employee[n];
		for (int i = 0; i < n; i++) {
			e[i]=new Employee();
			e[i].accept();
		}
		
		System.out.println("Name\tJoining year\tAddress\t\tSalary");
		for (int i = 0; i < n; i++) {
			e[i].display();
		}
		
	}
}
