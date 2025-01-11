package $05_Conditional_Statements;
import java.util.Scanner;

public class _08_Compare_three_num {
    public static void main(String[] args) {

        // Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a==b && a==c){
            System.out.println("All numbers are equal..!!");
        }
        //else if(a!=b && a!=c){  --> 3 4 4 : all num are different
        else if(a!=b && a!=c && b!=c){
            System.out.println("All numbers are different..!!");
        }
        else{
            System.out.println("Neither all are equal nor different");
        }


    }
}
