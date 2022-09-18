import java.util.Scanner;

public class OddEvenDigit {
	public static void main(String[] args) {
		int number, sum = 0, odd = 0, even = 0, i;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		number = input.nextInt();

		while (number > 0) {
			i = number % 10;
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
			number /= 10;
		}
		System.out.println("Sum of Even Digits : " + even);
		System.out.println("Sum of Odd Digits : " + odd);
	}
}
