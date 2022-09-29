package assignment2;

class Parent {
	public void show() {
		System.out.println("This is parent class");
	}
}

public class Child extends Parent {
	public void display() {
		System.out.println("This is child class");
	}
	public void show() {
		super.show();
		System.out.println("This is derived class");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		//Child p1=(Child)new Parent();
		//p1.show();
		
		Parent p2=new Child();
		p2.show();
		

		p.show();
		c.display();
		c.show();

	}
}
