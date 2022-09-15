import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n, temp, rem, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = input.nextInt();
        temp = n;

        while (n>0) {
            rem = n%10;
            sum += rem * rem * rem;
            n /= 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is armstrong number");
        } else {
            System.out.println(temp + " is not armstrong number");
        }
    }
}
