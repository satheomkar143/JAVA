import java.util.Scanner;

public class AtmMachine {
	public static void main(String[] args) {
		int balance=0, deposite, withdraw=0, request=0;
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("\nCheck balance : 1");
			System.out.println("Deposite money : 2");
			System.out.println("Withdraw money : 3");
			System.out.println("Cancle transaction: 4");
			System.out.print("Enter : ");
			request = input.nextInt();
			
			switch (request) {
			case 1:
				System.out.println("Current balance: " + balance);
				break;
			case 2:
				System.out.print("Enter Amount: ");
				deposite = input.nextInt();
				balance += deposite; 
				System.out.println("money deposite successfully!!");
				break;
			case 3:
				System.out.print("Enter Amount: ");
				withdraw = input.nextInt();
				if (balance >= withdraw) {
					balance -= withdraw;
					System.out.println("money withdraw successfully!!");
				} else {
					System.out.println("Insufficient Balance.");
				}
				break;
			case 4:
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
