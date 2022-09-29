package upcastingPolymorphism;

class Game {
	public void Type() {
		System.out.println("indoor and outdoor games");
	}
}

public class Cricket extends Game {
	public void Type() {
		System.out.println("outdoor games");
	}

	public static void main(String[] args) {
		Game gm = new Game();
		gm.Type();

		Cricket ck = new Cricket();
		ck.Type();

		gm = ck;  // gm refers to cricket object
		gm.Type();  //calls cricket's version of object
	}
}
