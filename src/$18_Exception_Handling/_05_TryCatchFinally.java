package $18_Exception_Handling;

import java.util.Scanner;

public class _05_TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b (once as zero and non-zero) : ");
        int b = sc.nextInt();

        try {
            int c = a/b;
            System.out.println("Result of division is "+c);
        }
        catch (ArithmeticException e){
            System.out.println("This catch block will execute only if b = 0");
            System.out.println("Exception is caused by -> "+e);
        }
        finally {
            System.out.println("This finally block will always get executed irrespective of exception occurs or not");
        }

    }
}
