package $05_Conditional_Statements;

import java.util.Scanner;

public class _11_Find_radix {
    public static void main(String[] args) {

        //find radix of a number taken as a string from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String num = input.next();
        input.close();

        if(num.matches("[01]+")){
            System.out.println("Binary : radix = 2");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Octal : radix = 8");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("Decimal : radix = 10");
        }
        else if(num.matches("[0-9a-fA-F]+")){
            System.out.println("Hexadecimal : radix = 16");
        }
        else{
            System.out.println("ERROR : Invalid number !!");
        }

    }
}
