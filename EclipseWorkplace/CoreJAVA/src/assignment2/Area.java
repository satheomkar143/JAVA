package assignment2;

class Reactangle {
	private int lenght;
	private int width;

	public Reactangle(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
	}

	public void printArea() {
		System.out.println("area = " + (lenght * width));
	}

	public void printPerimeter() {
		System.out.println("perimeter = " + (2 * (lenght + width)));
	}
}

class Square extends Reactangle {
	int side;

	public Square(int lenght, int width, int side) {
		super(lenght, width);
		this.side = side;
	}

	public void printArea() {
		super.printArea();
		System.out.println("area = " + (side * side));
	}

	public void printPerimeter() {
		super.printPerimeter();
		System.out.println("perimeter = " + (4 * side));
	}
}

public class Area {
	public static void main(String[] args) {
		Square s = new Square(5, 6, 7);
		s.printArea();
		s.printPerimeter();

		Square[] s1 = new Square[10];

		for (int i = 0; i < s1.length; i++) {
			s1[i] = new Square(i + 2, i + 4, i + 6);
		}
		for (int i = 0; i < s1.length; i++) {
			s1[i].printArea();
			s1[i].printPerimeter();
		}
	}

}
