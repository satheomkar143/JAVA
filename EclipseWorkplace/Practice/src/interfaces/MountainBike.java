package interfaces;

class MountainBike implements Bicycle {
	public int seatHeight;
	public int gear;
	public int speed;

	public MountainBike(int startHeight, int startSpeed, int startGear) {

		seatHeight = startHeight;
		speed = startSpeed;
		gear = startGear;
	}

	public void applyBreak(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	public void setHeight(int height) {
		seatHeight = height;
	}
}
