import java.util.Scanner;

class Calculate {
	private float result;
	int num1, num2, num3;

	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		num1 = input.nextInt();
		System.out.print("Enter number 2: ");
		num2 = input.nextInt();
		System.out.print("Enter number 3: ");
		num3 = input.nextInt();
	}

	void print() {
		result = (num1 + num2 + num3) / 3.0F;
		System.out.println(String.format("Average: %.2f", result));
	}
}

public class Average {
	public static void main(String[] args) {
		Calculate c = new Calculate();
		c.accept();
		c.print();
	}
}
