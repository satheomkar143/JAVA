import java.util.Scanner;

class Rectangle {
	private int lenght, width, area;

	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter lenght: ");
		lenght = input.nextInt();
		System.out.print("Enter Width: ");
		width = input.nextInt();
	}

	void display() {
		area = lenght * width;
		System.out.println(lenght + "\t" + width + "\t" + area);
	}
}

public class Area {

	public static void main(String[] args) {
		Rectangle[] r = new Rectangle[3];

		for (int i = 0; i < 3; i++) {
			r[i] = new Rectangle();
			r[i].accept();
		}
		System.out.println("length\twidth\tarea");
		for (int i = 0; i < 3; i++) {
			r[i].display();
		}
	}

}
