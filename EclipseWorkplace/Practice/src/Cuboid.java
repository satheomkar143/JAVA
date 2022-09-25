
public class Cuboid {
	int width;
	int height;
	int depth;

	Cuboid() {
		this.width = 10;
		this.height = 10;
		this.depth = 10;
	}

	Cuboid(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Cuboid(int width, int height) {
		this.width = width;
		this.height = height;
		this.depth = 10;
	}

	Cuboid(int dimension) {
		this.width = dimension;
		this.height = dimension;
		this.depth = dimension;
	}

	public int volume() {
		return width * height * depth;
	} 

	public static void main(String[] args) {

		Cuboid c = new Cuboid();
		System.out.println("volume of c : " + c.volume());

		Cuboid c1 = new Cuboid(20);
		System.out.println("volume of c1 : " + c1.volume());

		Cuboid c2 = new Cuboid(20, 30);
		System.out.println("volume of c2 : " + c2.volume());

		Cuboid c3 = new Cuboid(10, 20, 30);
		System.out.println("volume of c3 : " + c3.volume());

	}
}
