import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		int hour, second, minute;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time in seconds: ");
		second = input.nextInt();

		System.out.println("time converted into hour and minute: ");
		if (second >= 3600) {
			hour = second / 3600;
			second %= 3600;
			System.out.print(hour + " Hour: ");
		}
		if (second >= 60) {
			minute = second / 60;
			second %= 60;
			System.out.println(minute + " Minute");
		}
		if (second < 60) {
			System.out.println(second + " second");
		}
	}
}
