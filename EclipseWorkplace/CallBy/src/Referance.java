
public class Referance {
	int x = 10;
	int y = 20;

	public void Change(Referance t) {
		t.x = 100;
		t.y = 200;
	}

	public static void main(String[] args) {
		Referance ts = new Referance();
		System.out.println("before x: " + ts.x + " y: " + ts.y);
		ts.Change(ts);
		System.out.println("after x: " + ts.x + " y: " + ts.y);
	}
}
