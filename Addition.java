import java.util.Scanner;

public class Addition{
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        int c = a+b;
        System.out.println(c);
    }
}