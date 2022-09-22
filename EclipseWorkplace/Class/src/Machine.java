import java.util.Scanner;

class VendingMachine {
	private String[] product = { "Cadburry", "Cold-drink", "Lolypop", "Waffers", "Biscuit" };
	int[] price = { 50, 35, 5, 10, 20 };
	int productChoice, productQuantity;
	int choice, totalPrice = 0, total;
	Scanner input = new Scanner(System.in);

	public void products() {
		System.out.println("Choice\tPrice\tProducts");
		for (int i = 0; i < product.length; i++) {
			System.out.println((i + 1) + "\t" + price[i] + "\t" + product[i]);
		}
	}

	void select() {

		do {
			System.out.println("\nselect your products and quantity");
			productChoice = input.nextInt();
			productQuantity = input.nextInt();
			totalPrice = totalPrice + price[productChoice - 1] * productQuantity;
			System.out.println("\n1: Select more products");
			System.out.println("0: Exit");
			choice = input.nextInt();

		} while (choice == 1);

	}

	void amount() {
		System.out.println("total price = " + totalPrice);
	}

	void coins() {
		System.out.println("Please insert coins to collect your products.");
		System.out.println("Accepted coins are 5, 10, 20, 50, 100");
		int coins;
		total = 0;
		do {
			System.out.println("insert coins");
			coins = input.nextInt();
			total += coins;

			if (totalPrice > total) {
				System.out.println("Oops Amount insufficient");
			} else {
				System.out.println("That's enough money to buy product.");
			}

			System.out.println("\n1: Add more coins");
			System.out.println("0: Exit");
			choice = input.nextInt();
		} while (choice == 1);
	}

	void buy() {
		if (totalPrice > total) {
			System.out.println("you have insufficient coins.\nSorry you cannot buy this products");
		} else {
			System.out.println("That's good! Collect your products.\n");
		}

		int change = total - totalPrice;

		if (change > 0) {
			System.out.println("change amount: " + change);
		}
		int[] coin = { 100, 50, 20, 10, 5 };
		while (change > 0) {
			for (int j = 0; j < coin.length; j++) {
				if (change >= coin[j]) {
					int c = change / coin[j];
					System.out.println(coin[j]+" cents= "+c+" coins");
					change %= coin[j];
				}
			}
		}

	}
}

public class Machine {
	public static void main(String[] args) {
		VendingMachine v = new VendingMachine();
		v.products();
		v.select();
		v.amount();
		v.coins();
		v.buy();

	}
}
