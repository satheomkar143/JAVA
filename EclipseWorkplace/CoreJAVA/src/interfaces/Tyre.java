//multiple inheritance

package interfaces;

interface Movable1 {
	boolean isMovable();
}

interface Rollable {
	boolean isRollable();
}

public class Tyre implements Movable1, Rollable {
	public boolean isMovable() {
		return true;
	}

	public boolean isRollable() {
		return true;
	}

	public static void main(String[] args) {
		Tyre t = new Tyre();
		System.out.println(t.isMovable());
		System.out.println(t.isRollable());
	}

}
