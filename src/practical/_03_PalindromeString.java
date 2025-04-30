package practical;

import java.util.Scanner;

public class _03_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String rev = "";

        //reverse string
        for(int i=0;i<str.length(); rev=str.charAt(i)+rev, i++);

        System.out.println("Original : "+str);
        System.out.println("Reverse : "+rev);
        System.out.println("Palindrome : "+(rev.equals(str)));

    }
}