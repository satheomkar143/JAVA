package javaMethods;

public class ValueOf {
	public static void main(String[] args) {
		Integer a = Integer.valueOf(45);
		Float b = Float.valueOf("78");
		Double c = Double.valueOf(15);
		Integer d = Integer.valueOf("500",10);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
