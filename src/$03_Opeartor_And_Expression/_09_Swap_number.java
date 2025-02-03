package $03_Opeartor_And_Expression;

import java.util.Scanner;

public class _09_Swap_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = input.nextInt();
        System.out.print("Enter B : ");
        int b = input.nextInt();
        input.close();

        System.out.println("Before swapping -> A : "+a+", B : "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping -> A : "+a+", B : "+b);

    }
}
