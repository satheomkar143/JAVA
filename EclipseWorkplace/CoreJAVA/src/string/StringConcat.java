package string;
// .concat()   +

public class StringConcat {
	public static void main(String[] args) {
		String str = "hello ";
		String str1 = "world";
		String str2 = str.concat(str1);
		System.out.println(str2);

		String str3 = "hello ".concat("java");
		System.out.println(str3);

		String s1 = "rahul ";
		String s2 = "dravid";
		String s3 = s1 + s2;
		System.out.println(s3);

		String s4 = "omkar " + "sathe";
		System.out.println(s4);

	}
}
