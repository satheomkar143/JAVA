import java.util.Scanner;

public class SplitArray {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		n = input.nextInt();
		int[] a = new int[n];
		int[] b = new int[n / 2];
		int[] c = new int[n / 2];

		System.out.println("Enter Array Element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}

		for (int i = 0, j = 0; i < a.length; i++) {
			if (i < n / 2) {
				b[i] = a[i];
			} else {
				c[j] = a[i];
				j++;
			}
		}

		System.out.println("After spliting");
		System.out.println("Array B: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println("\nArray C: ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + "\t");
		}

	}
}
