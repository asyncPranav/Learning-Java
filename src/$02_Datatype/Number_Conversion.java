package $02_Datatype;
import java.util.Scanner;

public class Number_Conversion{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num1 = input.nextInt();

        System.out.println("Binary : " + Integer.toBinaryString(num1));
        System.out.println("Octal : " + Integer.toOctalString(num1));
        System.out.println("Hexdecimal : " + Integer.toHexString(num1));

        //now let's understand how negative numbers are stored in binary form
        //as we know that negative numbers are stored in 2's compliment form

        System.out.print("\nEnter a negative of same number : ");
        int num2 = input.nextInt();

        System.out.println("Binary : " + Integer.toBinaryString(num2));
    }
}
