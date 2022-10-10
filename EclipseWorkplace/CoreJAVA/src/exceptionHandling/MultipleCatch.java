package exceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2 };
			arr[2] = 3 / 6;
		} catch (ArithmeticException e) {
			System.out.println("devide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound");
		}
	}
}
