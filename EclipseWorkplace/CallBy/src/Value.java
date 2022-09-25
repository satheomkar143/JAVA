
public class Value {
	public void Change(int x) {
		x = 100;
		System.out.println("x: " + x);
	}

	public static void main(String[] args) {
		int x = 50;
		Value v = new Value();
		v.Change(x);
		System.out.println("x: " + x);
	}
}
 