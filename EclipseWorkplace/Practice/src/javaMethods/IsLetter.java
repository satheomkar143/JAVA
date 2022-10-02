package javaMethods;

public class IsLetter {
public static void main(String[] args) {
	System.out.println(Character.isLetter(9));
	System.out.println(Character.isLetter('9'));
	System.out.println(Character.isLetter('a'));
	System.out.println(Character.isLetter('%'));
	
	System.out.println(Character.isDigit('9'));
	System.out.println(Character.isDigit('a'));
	
	System.out.println(Character.isWhitespace(' '));
	System.out.println(Character.isWhitespace('a'));
	System.out.println(Character.isWhitespace('9'));
	
	System.out.println(Character.isUpperCase('a'));
	System.out.println(Character.isUpperCase('A'));
	
	System.out.println(Character.isLowerCase('a'));
	System.out.println(Character.isLowerCase('A'));
	
	System.out.println(Character.toUpperCase('a'));
	System.out.println(Character.toLowerCase('A'));
}
}
