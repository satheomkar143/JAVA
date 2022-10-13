package multithreading;

class Mythread1 extends Thread {
	public void run() {
		System.out.println("r1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("r2");
	}
}
public class JoinDemo {
	public static void main(String[] args) {
		Mythread1 t1 = new Mythread1();
		Mythread1 t2 = new Mythread1();
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
	}
}
