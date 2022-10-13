package multithreading;

class A extends Thread {
	public void run() {
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		}
	}
}

class B extends Thread {
	public void run() {
		int j;
		for (j = 1; j <= 5; j++) {
			System.out.println("j = " + j);
		}
	}
}

class C extends Thread {
	public void run() {
		int k;
		for (k = 1; k <= 5; k++) {
			System.out.println("k = " + k);
		}
	}
}

public class ThreadDemo1 {
	public static void main(String[] args) {
		A obj = new A();
		obj.start();
		
		B obj1 = new B();
		obj1.start();
		
		C obj2 = new C();
		obj2.start();
		
	}
}
