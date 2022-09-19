import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		n = input.nextInt();
		int[] a = new int[n];
		int positive = 0, negative = 0, odd = 0, even = 0, zero = 0;

		System.out.println("Enter Array Element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				positive++;
			} else if (a[i] < 0) {
				negative++;
			} else {
				zero++;
			}
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println("number of positive number: " + positive);
		System.out.println("number of negative number: " + negative);
		System.out.println("number of zeros: " + zero);
		System.out.println("number of odd number: " + odd);
		System.out.println("number of even number: " + (even-zero));

	}
}
