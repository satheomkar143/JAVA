package accessModifier;

//instance(non static) variable can not access by static method
public class NonStatic {
	int x;

	public static void main(String[] args) {
		x = 10;
		System.out.println("x=" + x);
	}
}
