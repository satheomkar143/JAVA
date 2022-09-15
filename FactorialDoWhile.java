import java.util.Scanner;

public class FactorialDoWhile {
    public static void main(String[] args) {
        int i=1, n, fact=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = input.nextInt();

        do {
            fact = fact * i;
            i++;
        } while (i<=n);

        System.out.println("factorial of "+n+ " is "+fact);

    }
}
