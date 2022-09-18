import java.util.Scanner;

public class ShopDiscount {
	public static void main(String[] args) {
		int quantity, cost;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter purchased quantity of item: ");
		quantity = input.nextInt();
		cost = quantity * 100;

		if (cost >= 1000) {
			cost = cost - (cost * 10 / 100);
		}
		System.out.println("Total cost of items: " + cost + " RS");

	}
}
