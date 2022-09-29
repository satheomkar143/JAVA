package upcastingPolymorphism;

class Bank {
	float getRateofInterest() {
		return 0;
	}
}

class SBI extends Bank {
	float getRateofInterest() {
		return 8.4F;
	}
}

class ICICI extends Bank {
	float getRateofInterest() {
		return 7.3F;
	}
}

class AXIS extends Bank {
	float getRateofInterest() {
		return 9.7F;
	}
}

public class TestPolymorphism {

	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("rate of interest= " + b.getRateofInterest());

		b = new ICICI();
		System.out.println("rate of interest= " + b.getRateofInterest());

		b = new AXIS();
		System.out.println("rate of interest= " + b.getRateofInterest());
	}

}
