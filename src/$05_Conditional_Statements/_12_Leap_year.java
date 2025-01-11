package $05_Conditional_Statements;
import java.util.Scanner;

public class _12_Leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = input.nextInt();
        input.close();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("-> yes a leap year");
                }
                else{
                    System.out.println("-> Not a leap year");
                }
            }
            else{
                System.out.println("-> yes a leap year");
            }
        }
        else{
            System.out.println("-> not a leap year");
        }
    }
}
