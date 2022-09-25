class Car {
	private String brand;

	Car(){
		brand="Ford";
	}

	public String getBrand() {
		return brand;
	}
}

public class Vehicle2 {
	public static void main(String[] args) {
		Car c = new Car();
		String brand = c.getBrand();
		System.out.println("Brand name = "+brand);
	}
}
