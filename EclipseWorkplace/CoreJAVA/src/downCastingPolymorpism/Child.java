package downCastingPolymorpism;

class Parent {
};

public class Child extends Parent {

	public void chack() {
		System.out.println("Successful cating");
	}

	public static void show(Parent p) {
		if (p instanceof Child) {
			Child c1 = (Child) p;
			c1.chack();
		}
	}

	public static void main(String[] args) {
		Parent p = new Child();
		Child.show(p);
	}
}
