import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        float a, b, result=0;
        String operator;
        Scanner input = new Scanner(System.in);

        System.out.print("Select operator: + - / * :   ");
        operator = input.nextLine();
        
        System.out.print("Enter values of a and b: ");
        a = input.nextInt();
        b = input.nextInt();

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Enter proper input.");
                break;
        }
        System.out.println(a + operator + b + " = " + result);
    }
}
