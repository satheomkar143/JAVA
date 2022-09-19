import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array size: ");
		n = input.nextInt();
		int[] a = new int[n];

		System.out.println("Enter Array Element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
