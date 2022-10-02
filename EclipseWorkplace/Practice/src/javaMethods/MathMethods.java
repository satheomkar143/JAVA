package javaMethods;

public class MathMethods {
	public static void main(String[] args) {
		int x = -28;
		System.out.println(Math.abs(x));

		int a = -48;
		float b = -34.65f;
		float c = 56.343f;
		System.out.println(Math.ceil(a));
		System.out.println(Math.ceil(b));
		System.out.println(Math.ceil(c));

		System.out.println(Math.floor(a));
		System.out.println(Math.floor(b));
		System.out.println(Math.floor(c));

		System.out.println(Math.rint(b));
		System.out.println(Math.rint(c));

		System.out.println(Math.round(b));
		System.out.println(Math.round(c));

		System.out.println(Math.max(15, 20));
		System.out.println(Math.max(b, c));
		
		System.out.println(Math.min(15, 20));
		System.out.println(Math.min(b, c));
		
		System.out.printf("exp of %.3f is %.2f\n",2.5456,Math.exp(2.5456));
		System.out.printf("log of %.3f is %.2f%n",2.5456,Math.log(2.5456));
		
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(9));
		
		int degree=90;
		double radians=Math.toRadians(degree);
		System.out.println(Math.sin(radians));
		System.out.println(Math.cos(radians));
		System.out.println(Math.tan(radians));
		
		System.out.println(Math.toDegrees(Math.asin(Math.sin(radians))));
		System.out.println(Math.toDegrees(Math.acos(Math.cos(radians))));
		System.out.println(Math.toDegrees(Math.atan(Math.tan(radians))));
		
		System.out.println(Math.random());
		
		System.out.println(Math.toDegrees(3.142));
		
		System.out.println(Math.toRadians(180));
		
		
	}
}
