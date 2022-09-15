import java.util.Scanner;

public class BasicSalary {
    public static void main(String[] args) {
        int bs, hra, ta, bonus, netsal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        bs = input.nextInt();

        if (bs > 10000) {
            hra = bs * 10/100;
            ta = bs * 5/100;
            bonus = 2400;
        } else {
            hra = bs * 5/100;
            ta = bs * 1000;
            bonus = 1500;
        }

        netsal = bs + hra + ta + bonus;

        System.out.println("bs\thra\tta\tbonus\tnetsal");
        System.out.println("\n"+bs+"\t"+hra+"\t"+ta+"\t"+bonus+"\t"+netsal);
    }
}
