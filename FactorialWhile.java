import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        int i=2, n, fact=1;
        
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        n = input.nextInt();

        while (i<=n) {
            fact = fact * i;
            i++;
        }
        System.out.println("factorial of "+n+ " is "+fact);

    }
}
