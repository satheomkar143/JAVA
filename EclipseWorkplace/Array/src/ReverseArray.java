import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 Array Element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("reverse array:");
		for (int i = 4; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}
