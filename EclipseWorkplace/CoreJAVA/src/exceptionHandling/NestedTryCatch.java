package exceptionHandling;

public class NestedTryCatch {
	public static void main(String[] args) {
		try {
			int[] arr = { 5, 0, 2, 6 };
			try {
				int x = arr[3] / arr[1];
			} catch (ArithmeticException e) {
				System.out.println("devide by zero");
			}
			arr[4] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound");
		}
	}
}
