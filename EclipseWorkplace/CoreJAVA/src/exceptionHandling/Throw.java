package exceptionHandling;
// used in inside function
public class Throw {
	static void avg() {
		try {
			throw new ArithmeticException("Demo");
		} catch (ArithmeticException e) {
			System.out.println("Exception caught");
		}
	}

	public static void main(String[] args) {
		avg();
	}
}
