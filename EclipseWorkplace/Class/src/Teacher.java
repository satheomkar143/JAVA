import java.util.Scanner;

class Student {
	private 
	int rollNo;
	String name;
	double marks;

	public 
	void accept() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Roll number: ");
		rollNo = input.nextInt();
		System.out.print("Enter Name: ");
		name = input.next();
		System.out.print("Enter marks: ");
		marks = input.nextDouble();
	}

	void display() {
		System.out.println("Roll number = " + rollNo);
		System.out.println("Name = " + name);
		System.out.println("Marks = " + marks);
	}
}

public class Teacher {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.accept();
		s1.display();
	}
}
