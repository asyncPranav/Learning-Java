package practical;

import java.util.Scanner;

public class _01_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter another number : ");
        int b = sc.nextInt();

        System.out.println("Sum of "+a+" and "+b+" : "+(a+b));
    }
}
