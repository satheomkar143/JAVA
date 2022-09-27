package methodOverloading;

//method overloading by changing number of variable 

public class Area {
	void AreaRect(int l, int b) {
		System.out.println("Area: " + (l * b));
	}

	void AreaRect(int l, int b, int h) {
		System.out.println("Area: " + (l * b * h));
	}

	public static void main(String[] args) {
		Area a = new Area();
		a.AreaRect(2, 5);
		a.AreaRect(2, 5, 9);
	}
}
