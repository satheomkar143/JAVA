
public class StaticVariable {
	static int x = 100;
	int y = 100;

	public void increament() {
		x++;
		y++;
	}

	public static void main(String[] args) {
		StaticVariable t1 = new StaticVariable();
		StaticVariable t2 = new StaticVariable();
		System.out.println(StaticVariable.x);
		System.out.println(t2.y);

		t1.increament();
		t2.increament();
		System.out.println(StaticVariable.x);
		System.out.println(t2.y);
	}
}
