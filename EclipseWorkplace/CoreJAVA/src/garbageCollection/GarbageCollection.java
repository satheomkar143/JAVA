package garbageCollection;

public class GarbageCollection {
	public void finalize() {
		System.out.println("object is garbage collection");
	}

	public static void main(String[] args) {
		GarbageCollection t = new GarbageCollection();
		t = null;
		System.gc();
	}
}
