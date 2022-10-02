package assignment3;

import java.util.Scanner;

public class Item {
	private String code;
	private int price;

	public void accept(String code, int price) {
		this.code = code;
		this.price = price;
	}

	public void display() {
		System.out.println(code + '\t' + price);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String code;
		int i, price;
		Item[] itm = new Item[5];

		for (i = 0; i < 5; i++) {
			itm[i] = new Item();
			System.out.println("Enter code name and price for element " + (i + 1) + " = ");
			code = input.next();
			price = input.nextInt();
			itm[i].accept(code, price);
		}

		System.out.println("code\tprice");
		for (i = 0; i < 5; i++) {
			itm[i].display();
		}
	}
}
