import java.util.Scanner;

public class EmployeeBonus {
	public static void main(String[] args) {
		int serviceYear, salary, bonus = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter salary: ");
		salary = input.nextInt();
		System.out.print("Enter year of service: ");
		serviceYear = input.nextInt();

		if (serviceYear >= 5) {
			bonus = salary * 5 / 100;
		}

		System.out.println("Net bonus: " + bonus);
		System.out.println("Net salary: " + (salary + bonus));
	}
}
