package $03_Opeartor_And_Expression;
import java.util.Scanner;

public class _08_Swap_using_XOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("\nBefore swapping --> a : "+a+", b : "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping  --> a : "+a+", b : "+b);
    }
}
