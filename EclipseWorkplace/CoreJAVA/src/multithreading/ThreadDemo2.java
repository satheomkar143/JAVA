package multithreading;

class D implements Runnable {
	public void run() {
		int j;
		for (j = 1; j <= 5; j++) {
			System.out.println("j = " + j);
		}
	}
}

class E implements Runnable {
	public void run() {
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		}
	}
}

public class ThreadDemo2 {
	public static void main(String[] args) {
		D obj = new D();
		Thread t1 = new Thread(obj);
		t1.start();

		E obj1 = new E();
		Thread t2 = new Thread(obj1);
		t2.start();
	}
}
