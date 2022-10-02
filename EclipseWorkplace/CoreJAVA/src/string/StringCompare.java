package string;

// .equals() == compateTo()
public class StringCompare {
	public static void main(String[] args) {
		String s = "Hell";
		String s1 = "Hello";
		String s2 = "Hello";

		if (s1.equals(s2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (s.equals(s1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.println(s.equals(s2));

		String s11 = "java";
		String s22 = "java";
		String s33 = new String("java");

		if (s11 == s2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (s11 == s33) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		String st1 = "omkar";
		String st2 = "sathe";
		String st3 = "omkar";
		System.out.println(st1.compareTo(st2));
		System.out.println(st1.compareTo(st3));
		System.out.println(st2.compareTo(st1));

	}
}
