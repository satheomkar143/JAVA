package exceptionHandling;

public class UnreachableCatch {
	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2 };
			arr[2] = 3 / 6;
		} catch (Exception e) {
			System.out.println("devide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound");
		}
	}
}
