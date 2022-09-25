package inheritance;

class Bicycle {
	protected int gear;
	protected int speed;

	public Bicycle(int startSpeed, int startGear) {
		speed = startSpeed;
		gear = startGear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void applyBreak(int decreament) {
		speed -= decreament;
	}

	public void speedUp(int increment) {
		speed += increment;
	}
}
