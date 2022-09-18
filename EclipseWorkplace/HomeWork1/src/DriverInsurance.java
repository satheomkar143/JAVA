import java.util.Scanner;

public class DriverInsurance {
	public static void main(String[] args) {
		int age;
		char maritalStatus, sex;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter age: ");
		age = input.nextInt();
		System.out.print("Enter sex (M/F): ");
		sex = input.next().charAt(0);
		System.out.print("Enter marital status (M/U): ");
		maritalStatus = input.next().charAt(0);

		if (maritalStatus == 'm' || maritalStatus == 'M') {
			System.out.println("Driver is insured.");
		} else if (maritalStatus == 'u' || maritalStatus == 'U') {
			if (((sex == 'm' || sex == 'M') && age >= 30) || ((sex == 'f' || sex == 'F') && age >= 25)) {
				System.out.println("Driver is insured.");
			} else {
				System.out.println("Driver is not insured.");
			}
		} else {
			System.out.println("Driver is not insured.");
		}
	}
}
