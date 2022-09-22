import java.util.Scanner;

class Customer {
	private String name;
	double accountNumber;
	String type;
	double balance = 0;

	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = input.next();
		System.out.print("Enter Account number: ");
		accountNumber = input.nextDouble();
		System.out.print("Enter account type: ");
		type = input.next();
		System.out.print("Enter balance: ");
		balance = input.nextDouble();
	}

	void display() {
		System.out.println(name + "\t" + type + "\t\t" + balance + "\t" + accountNumber);
	}
}

public class Bank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of records: ");
		int n = input.nextInt();

		Customer[] c = new Customer[n];

		for (int i = 0; i < n; i++) {
			c[i] = new Customer();
			c[i].accept();
		}

		while (true) {
			System.out.println("\nSelect any option: ");
			System.out.println("1: Display all account no");
			System.out.println("2: Search by account number");
			System.out.println("3: Deposite the amount");
			System.out.println("4: Withdraw the amount");
			System.out.println("0: Exit");
			System.out.print("Enter choice: ");
			int choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Name\tAcc. Type\tBalance\tAcc. number");
				for (int i = 0; i < n; i++) {
					c[i].display();
				}
				break;
			case 2:
				System.out.print("Enter Acccount Number: ");
				int number = input.nextInt();
				int cnt = 1;
				for (int i = 0; i < n; i++) {
					if (number == c[i].accountNumber) {
						c[i].display();
						cnt = 1;
						break;
					} else {
						cnt = 0;
					}
				}
				if (cnt == 0) {
					System.out.println("Enter correct account number.");
				}
				break;
			case 3:
				System.out.print("Enter Acccount Number: ");
				number = input.nextInt();
				cnt = 1;
				for (int i = 0; i < n; i++) {
					if (number == c[i].accountNumber) {
						System.out.print("Enter Amount: ");
						int deposite = input.nextInt();
						c[i].balance += deposite;
						System.out.println("money deposite successfully!!");
						cnt = 1;
						break;
					} else {
						cnt = 0;
					}
				}
				if (cnt == 0) {
					System.out.println("Enter correct account number.");
				}
				break;
			case 4:
				System.out.print("Enter Acccount Number: ");
				number = input.nextInt();
				cnt = 1;
				for (int i = 0; i < n; i++) {
					if (number == c[i].accountNumber) {
						System.out.print("Enter Amount: ");
						int withdraw = input.nextInt();
						if (c[i].balance >= withdraw) {
							c[i].balance -= withdraw;
							System.out.println("money withdraw successfully!!");
						} else {
							System.out.println("Insufficient Balance.");
						}
						cnt = 1;
						break;
					} else {
						cnt = 0;
					}
				}
				if (cnt == 0) {
					System.out.println("Enter correct account number.");
				}
				break;
			case 0:
				System.out.println("Thank you for visiting!!");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter valid option.");
				break;
			}
		}

	}
}
