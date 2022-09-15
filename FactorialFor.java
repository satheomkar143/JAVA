import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        int n, fact=1;
        System.out.print("enter number: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of "+n+ " is "+fact);
    }
}
