import java.util.Scanner;

public class BaseAddition {

	public static void main(String[] args) {
		int base, number1, number2, result;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base: ");
		base = input.nextInt();
		System.out.print("Enter 1st number: ");
		number1 = input.nextInt();
		System.out.print("Enter 2nd number: ");
		number2 = input.nextInt();

		result = getSum(base, number1, number2);
		System.out.println(result);
	}

	public static int getSum(int base, int number1, int number2) {
		int carrier = 0, i = 1, reminder1, reminder2, reminder, add, sum = 0;

		while (number1 > 0 || number2 > 0) {
			reminder1 = number1 % 10;
			reminder2 = number2 % 10;
			add = reminder1 + reminder2 + carrier;
			if (add >= base) {
				carrier = 1;
			} else {
				carrier = 0;
			}
			reminder = add % base;
			sum = reminder * i + sum;
			number1 = number1 / 10;
			number2 = number2 / 10;
			i = i * 10;
		}
		sum = carrier * i + sum;
		return sum;
	}
}
