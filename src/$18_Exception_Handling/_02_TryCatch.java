package $18_Exception_Handling;

import java.util.Scanner;

public class _02_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a : ");
            int a = sc.nextInt();
            System.out.print("Enter b (once as zero & non-zero) : ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Result is " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator cant be zero");
            System.out.println("Error is caused by -> "+e);
        }
        System.out.println("End of the program");
        System.out.println("Bye Bye...");
    }
}
