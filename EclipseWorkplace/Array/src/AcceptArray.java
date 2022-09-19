import java.util.Scanner;

public class AcceptArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 Array Element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
