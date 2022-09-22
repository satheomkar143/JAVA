import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

class Students {
	private String name;
	int rollNo;
	int mark;

	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Roll number: ");
		rollNo = input.nextInt();
		System.out.print("Enter Name: ");
		name = input.next();
		System.out.print("Enter marks: ");
		mark = input.nextInt();
	}

	void display() {
		System.out.println("Roll number = " + rollNo);
		System.out.println("Name = " + name);
		System.out.println("Marks = " + mark);
	}
}

public class College {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = input.nextInt();
		Students[] s = new Students[n];

		for (int i = 0; i < s.length; i++) {
			s[i] = new Students();
			s[i].accept();
		}
		int max = 0, maxIndex = -1;
		for (int i = 0; i < s.length; i++) {
			if (max < s[i].mark) {
				max = s[i].mark;
				maxIndex = i;
			}
		}
		System.out.println("Details of student who has maximum mark: ");
		s[maxIndex].display();

		System.out.print("\n\nEnter roll number to see details: ");
		int search = input.nextInt();
		int cnt = 1;
		for (int i = 0; i < s.length; i++) {
			if (search == s[i].rollNo) {
				s[i].display();
				cnt = 1;
				break;
			} else {
				cnt = 0;
			}
		}
		if (cnt == 0) {
			System.out.println("This roll number not present.");
		}
	}
}
