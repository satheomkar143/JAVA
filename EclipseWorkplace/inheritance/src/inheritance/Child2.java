package inheritance;

class Parent2 {
	String name;

	public void display() {
		name = "parent";
		System.out.println("parent: " + name);
	}
}

public class Child2 extends Parent2 {
	String name;

	public void display() {
		name = "child";
		super.display();
		System.out.println("child: " + name);
	}

	public static void main(String[] args) {
		Child2 obj = new Child2();
		obj.display();
	}
}
