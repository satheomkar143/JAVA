
public class Explicit {
	public static void main(String[] args) {
		float f = 100.46F;
		long l = (long) f;
		int i = (int) l;

		System.out.println("float value: " + f);
		System.out.println("long value: " + l);
		System.out.println("int value: " + i);
	}
}
