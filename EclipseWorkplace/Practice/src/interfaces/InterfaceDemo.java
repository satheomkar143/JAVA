package interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		System.out.println("Gear is: " + mountainBike.gear);
		System.out.println("seat height is: " + mountainBike.seatHeight);
		System.out.println("Bike speed is: " + mountainBike.speed);
		mountainBike.applyBreak(3);
		System.out.println(" bike speed after break: " + mountainBike.speed);
		mountainBike.speedUp(10);
		System.out.println(" bike speed after speed up: " + mountainBike.speed);

	}
}
