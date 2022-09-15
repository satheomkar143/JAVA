import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args) {
        String ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any character: ");
        ch = input.nextLine();

        switch (ch) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("it is vowel.");
                break;
        
            default:
                System.out.println("it is consonant");
                break;
        }
    }
}
