import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n, sum=0, rem;
        Scanner input = new Scanner(System.in);
        System.out.print("enter number : ");
        n = input.nextInt();
        int temp = n;

        while (n>0) {
            rem = n%10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        
        if (sum == temp) {
            System.out.println(temp + " is palindrome number");
        } else {
            System.out.println(temp + " is not palindrome number");
        }
    }
}
