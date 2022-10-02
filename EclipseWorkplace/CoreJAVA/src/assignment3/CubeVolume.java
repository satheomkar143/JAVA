package assignment3;

public class CubeVolume {
	private int side;
	private int volume;

	public CubeVolume() {
		this.side = 5;
	}

	public CubeVolume(int side) {
		this.side = side;
	}

	public CubeVolume(CubeVolume c) {
		this.side = c.side;
	}

	public void showVolume() {
		volume = side * side * side;
		System.out.println("volume = " + volume);
	}

	public static void main(String[] args) {
		CubeVolume c1 = new CubeVolume();
		c1.showVolume();

		CubeVolume c2 = new CubeVolume(10);
		c2.showVolume();

		CubeVolume c3 = new CubeVolume(c2);
		c3.showVolume();
	}

}
