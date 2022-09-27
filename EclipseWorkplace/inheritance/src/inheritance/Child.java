package inheritance;

class Parent {
	public void p1() {
		System.out.println("parent method");
	}
}

public class Child extends Parent {
	public void c1() {
		System.out.println("child method");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.p1();
		obj.c1();
	}
}
