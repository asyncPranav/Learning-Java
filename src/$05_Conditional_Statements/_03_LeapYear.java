package $05_Conditional_Statements;
import java.util.Scanner;

public class _03_LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = input.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
        input.close();
    }
}
