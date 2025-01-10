package $04_String_Class_And_Printing;

import java.util.Scanner;

public class _07_Check_number_system {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in : ");
        int num = input.nextInt();
        //String str = num+""; //convert to string (method-01)
        String str = String.valueOf(num); //(method-02)

        System.out.println("Number is binary : "+str.matches("[01]+"));
        System.out.println("Number is octal : "+str.matches("[0-7]+"));

    }
}
