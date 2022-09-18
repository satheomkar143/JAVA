import java.util.Scanner;

public class MilkVendor {
	public static void main(String[] args) {
		int milkBuy;
		float water, buy, sell, profit;
		Scanner input = new Scanner(System.in);
		System.out.print("How much litre milk buy by vendor: ");
		milkBuy = input.nextInt();

		water = milkBuy / 4.0F;
		buy = milkBuy * 3.25F;
		sell = (milkBuy + water) * 4.15F;
		profit = sell - buy;

		System.out.println("Net profit of milk vendor: " + profit);
	}
}
