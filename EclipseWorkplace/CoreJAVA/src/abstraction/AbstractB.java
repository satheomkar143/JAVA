package abstraction;

abstract class AbstractA {
	abstract void callme();
	public void normal () {
		System.out.println("it is concreate method");
	}
}

public class AbstractB extends AbstractA {
	void callme() {
		System.out.println("this is call me");
	}

	public static void main(String[] args) {
		AbstractB obj = new AbstractB();
		obj.callme();
		obj.normal();
	}
}
