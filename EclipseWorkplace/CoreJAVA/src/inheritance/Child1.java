package inheritance;

class Parent1 {
	String name;
}

public class Child1 extends Parent1 {
	String name;

	public void display() {
		super.name = "parent";
		name = "child";
		System.out.println(super.name + " " + name);
	}

	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.display();
	}
}
