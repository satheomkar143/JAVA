import java.util.Scanner;

public class MonthlyIncome {
	public static void main(String[] args) {
		int monthlyIncome, monthlySell;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter monthly sell:  ");
		monthlySell = input.nextInt();

		if (monthlySell >= 50000) {
			monthlyIncome = 375 + monthlySell * 16 / 100;
		} else if (monthlySell >= 40000) {
			monthlyIncome = 370 + monthlySell * 14 / 100;
		} else if (monthlySell >= 30000) {
			monthlyIncome = 325 + monthlySell * 12 / 100;
		} else if (monthlySell >= 20000) {
			monthlyIncome = 300 + monthlySell * 9 / 100;
		} else if (monthlySell >= 10000) {
			monthlyIncome = 250 + monthlySell * 5 / 100;
		} else {
			monthlyIncome = 200 + monthlySell * 3 / 100;
		}

		System.out.println("Monthly income of person: " + monthlyIncome);
	}
}
