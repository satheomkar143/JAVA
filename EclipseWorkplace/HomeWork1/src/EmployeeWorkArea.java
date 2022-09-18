import java.util.Scanner;

public class EmployeeWorkArea {
	public static void main(String[] args) {
		int age;
		char sex, maritalStatus;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter age:  ");
		age = input.nextInt();
		System.out.print("Enter sex: ");
		sex = input.next().charAt(0);
		System.out.print("Enter marital status: ");
		maritalStatus = input.next().charAt(0);

		if (sex == 'F' || sex == 'f') {
			System.out.println("You will work only in urban areas.");
		} else if (sex == 'm' || sex == 'M') {
			if (age >= 20 && age <= 40) {
				System.out.println("You will work in anywhere");
			} else if (age >= 40 && age <= 60) {
				System.out.println("You will work in anywhere");
			} else {
				System.out.println("ERROR");
			}
		} else {
			System.out.println("Enter valid sex.");
		}
	}
}
