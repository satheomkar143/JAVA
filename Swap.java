import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        System.out.println("Before swap a = " + a +" b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("after swap a = "+ a + " b = " + b);
    }
}