package StringBuffer;

public class StringBuilderr {
	public static void main(String[] args) {
		String s1 = new String("Spark");
		s1.concat("institute");
		System.out.println(s1);

		StringBuilder s2 = new StringBuilder("test");
		s2.append(123);
		System.out.println(s2);

		StringBuilder s3 = new StringBuilder("hello");
		s3.insert(3, "java");
		System.out.println(s3);

		StringBuilder str = new StringBuilder("Hello");
		str.reverse();
		System.out.println(str);

		StringBuilder st = new StringBuilder("Hello good morning");
		st.replace(6, 13, "java");
		System.out.println(st);

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());

		sb.append("hello");
		System.out.println(sb.capacity());

		sb.append("java is my favourite language");
		System.out.println(sb.capacity());

		sb.append("string");
		System.out.println(sb.capacity());

		// sb.ensureCapacity(10);
	}
}
