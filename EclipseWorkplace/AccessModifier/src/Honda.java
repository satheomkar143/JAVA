//final method(cannot override) and final class(cannot extend)
class bikes{

	final public void run() {
		System.out.println("running");
	}
}

public class Honda extends bikes {
	public void run() {
		System.out.println("running safaty with 100km.");
	}

	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();
	}
}
