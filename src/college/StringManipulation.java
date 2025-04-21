package college;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.println("Original String  : "+str);
        System.out.println("Lowercase String : "+str.toLowerCase());
        System.out.println("Uppercase String : "+str.toUpperCase());
        System.out.println("Length of String : "+str.length());
        System.out.println("SubString (2,5)  : "+str.substring(2,6));
        System.out.println("Is String empty  : "+str.isEmpty());
        System.out.println("Replace a with @ : "+str.replace('a','@'));
        System.out.println("Character array  : "+ java.util.Arrays.toString(str.toCharArray()));
    }
}
