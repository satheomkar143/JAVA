package accessModifier;

//final variable
public class Bike {
	final int speedLimit = 90;

	public void Run() {
		speedLimit = 400;
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.Run();
	}
}
