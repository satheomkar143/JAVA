package multithreading;

class First {
	//synchronized public void display(String msg) {          synchronized method
	public void display(String msg) {	
		System.out.println("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Second extends Thread {
	String msg;
	First fobj;

	public Second(First fp, String str) {
		fobj = fp;
		msg = str;
		start();
	}

	public void run() {
		synchronized (fobj) {					//synchronized block
			fobj.display(msg);
		}
		
	}
}

public class SynchronizedMethod {
	public static void main(String[] args) {
		First fnew = new First();
		Second ss = new Second(fnew, "welcome");
		Second ss1 = new Second(fnew, "new");
		Second ss2 = new Second(fnew, "programmer");

	}
}
