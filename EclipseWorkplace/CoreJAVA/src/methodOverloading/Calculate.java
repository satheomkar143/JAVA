package methodOverloading;

//method overloading by changing variable data type 
public class Calculate {
	void Sum(int a, int b) {
		System.out.println("sum: " + (a + b));
	}

	void Sum(float a, float b) {
		System.out.println("sum: " + (a + b));
	}

	public static void main(String[] args) {
		Calculate c = new Calculate();
		c.Sum(45, 20);
		c.Sum(12.56F, 10.23F);
	}
}
