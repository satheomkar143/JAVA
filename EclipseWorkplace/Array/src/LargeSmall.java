import java.util.Arrays;
import java.util.Scanner;

public class LargeSmall {
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

		System.out.println("Smallest element in array: "+a[0]);
		System.out.println("Largest element in array: "+a[n-1]);
		System.out.println("Second Smallest element in array: "+a[1]);
		System.out.println("Second Largest element in array: "+a[n-2]);
	}
}
