import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		float heldClass, attendClass, percentage;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of classes held: ");
		heldClass = input.nextFloat();
		System.out.print("Enter number of classes attend: ");
		attendClass = input.nextFloat();

		percentage = (attendClass / heldClass) * 100;
		System.out.println("percentage of class attended: " + percentage);

		if (percentage >= 75) {
			System.out.println("Student is allowed to sit in exam");
		} else {
			System.out.println("Student is not allowed to sit in exam");
		}
	}
}
