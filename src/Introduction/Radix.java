package Introduction;
import java.lang.*;
import java.util.*;

public class Radix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        input.useRadix(2);
        int num1 = input.nextInt();
        System.out.println("Decimal number = " + num1);

        System.out.print("Enter a octal number : ");
        input.useRadix(8);
        int num2 = input.nextInt();
        System.out.println("Decimal number = " + num2);

        System.out.print("Enter a hexadecimal number : ");
        input.useRadix(16);
        int num3 = input.nextInt();
        System.out.println("Decimal number = " + num3);

    }
}