package practical;

import java.util.Scanner;

public class _03_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int t = n;
        int r = 0;

        //reverse nummber
        for(;n>0; r=r*10+n%10, n/=10);

        System.out.println("Reverse : "+r);
        System.out.println("Palindrome : "+(r==t));

    }
}
