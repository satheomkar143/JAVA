package exceptionHandling;

public class TryAndCatch {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 10;
			int c = b / a;
			System.out.println("this line not printed");
		} catch (Exception e) {
			System.out.println("devide by zero");
		}
		System.out.println("display after try and catch block");
	}
}
