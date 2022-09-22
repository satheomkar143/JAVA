import java.util.Scanner;

public class MatrixSum {
	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		Scanner input = new Scanner(System.in);

		System.out.println("Enter matrix A: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter matrix B: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
