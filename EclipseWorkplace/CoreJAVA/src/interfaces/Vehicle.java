package interfaces;

interface Movable {
	int avgSpeed = 40;

	void move();
}

class Vehicle implements Movable {
	public void move() {
		System.out.println("vehicle moving");
		System.out.println("avg speed= " + avgSpeed);
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.move();
	}
}
