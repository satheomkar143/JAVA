import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		n = input.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		System.out.println("Enter Array Element: ");
		for (int i = 0, j = n - 1; i < a.length; i++, j--) {
			a[i] = input.nextInt();
			b[j] = a[i];
		}
		System.out.println("After copy array in reverse order:");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}
}
