import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		int young=0, old=0;
		int[] age = new int[3];
		String[] name = new String[3];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter name and age:  ");
			name[i] = input.next();
			age[i] = input.nextInt();
		}
		if (age[0] > age[1] && age[0] > age[2]) {
			old = 0;
		} else if (age[1] > age[0] && age[1] > age[2]) {
			old = 1;
		} else if (age[2] > age[0] && age[2] > age[1]) {
			old = 2;
		}
		
		if (age[0] < age[1] && age[0] < age[2]) {
			young = 0;
		} else if (age[1] < age[0] && age[1] < age[2]) {
			young = 1;
		} else if (age[2] < age[0] && age[2] < age[1]) {
			young = 2;
		}
		
		System.out.println("Youngest person: "+name[young]);
		System.out.println("Oldests person: "+name[old]);
	}
}
