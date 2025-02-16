package college;

import java.util.Scanner;
public class Fibonacci {

    //recursive method
    static int WithRecursion(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else return WithRecursion(n-2)+WithRecursion(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int n = sc.nextInt();

        int a=0, b=1, c=0, sum=0;
        System.out.print("Without Recursion : ");
        for(int i=0; i<n; i++){
            if(i<=1){
                c=i;
            }
            else{
                c=a+b;
                a=b;
                b=c;
            }
            sum += c;
            System.out.print(c+" ");

        }

        //with Recursion
        System.out.print("\nWith Recursion : ");
        for (int i=0; i<n; i++){
            System.out.print(WithRecursion(i));
            System.out.print(" ");
        }

        System.out.println("\nsum : "+sum);

    }
}
