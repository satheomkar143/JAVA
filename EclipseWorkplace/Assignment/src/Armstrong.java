import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		int temp = number;
		int sum = 0;
		while (temp > 0) {
			int i = temp % 10;
			sum = sum + (int) Math.pow(i, 3);
			temp = temp / 10;
		}
		if (sum == number) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}
}
