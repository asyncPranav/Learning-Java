package $05_Conditional_Statements;

import java.util.Scanner;

public class _02_Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = input.nextInt();
        if(num<0){
            System.out.println(num + " is negative integer");
        }else if(num>0){
            System.out.println(num + " is positive integer");
        }else{
            System.out.println(num + " is zero");
        }
        input.close();
    }
}
