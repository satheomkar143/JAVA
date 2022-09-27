package inheritance;

class base {
	public void display() {
		System.out.println("it is base class");
	}
}

public class Derived extends base {
	public void display() {
		super.display();
		System.out.println("it is derived class");
	}

	public static void main(String[] args) {
		Derived d1 = new Derived();
		d1.display();
	}
}
