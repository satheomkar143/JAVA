//call without creating instance of class
public class StaticMethod {

	public static void Square(int x) {
		System.out.println("square= " + (x * x));
	}

	public static void main(String[] args) {
		Square(8);
	}
}
