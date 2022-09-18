import java.util.Scanner;

public class BaseToBase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		System.out.println("Enter source base: ");
		int sourceBase = input.nextInt();
		System.out.println("Enter destination base: ");
		int destBase = input.nextInt();
		int decimal = sourceToDecimal(number, sourceBase);
		int dest = decimalToDest(decimal, destBase);
		System.out.println(dest);
	}

	// Converting number from source base to decimal
	public static int sourceToDecimal(int number, int base) {
		int i = 1;
		int sum = 0;
		while (number > 0) {
			int reminder = number % 10;
			sum = sum + reminder * i;
			i = i * base;
			number /= 10;
		}
		return sum;
	}

	// Converting number from decimal to destination base
	public static int decimalToDest(int number, int base) {
		int i = 1;
		int sum = 0;
		while (number > 0) {
			int reminder = number % base;
			sum = sum + reminder * i;
			i = i * 10;
			number /= base;
		}
		return sum;
	}
}