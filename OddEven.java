import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        n = input.nextInt();
        
        if (n%2 == 0) {
            System.out.println("Even number");

        } else {
            System.out.println("odd number");
        }
    }
}
