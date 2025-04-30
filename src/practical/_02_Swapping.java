package practical;

import java.util.Scanner;

public class _02_Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println("A : "+a+", B : "+b);

        //swap
        a = a+b-(b=a);
        System.out.println("A : "+a+", B : "+b);
    }
}
