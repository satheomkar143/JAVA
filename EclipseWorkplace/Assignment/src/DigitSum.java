import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		int i, number, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextInt();

		while (number > 0) {
			i = number % 10;
			sum = sum + i;
			number /= 10;
		}
		System.out.println("Sum of Digits : " + sum);
	}
}
