package $05_Conditional_Statements;
import java.util.Scanner;

public class _16_Menu_driven_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------Calculator------------\n");
        System.out.print("Enter two numbers : ");
        float a = input.nextFloat();
        float b = input.nextFloat();

        System.out.println("--> add");
        System.out.println("--> sub");
        System.out.println("--> mul");
        System.out.println("--> div");
        System.out.print("choose option from above : ");
        String option = input.next();
        input.close();

        switch(option){
            case "add" :
                System.out.println("Result : "+(a+b));
                break;
            case "sub" :
                System.out.println("Result : "+(a-b));
                break;
            case "mul" :
                System.out.println("Result : "+(a*b));
                break;
            case "div" :
                System.out.println("Result : "+(a/b));
                break;
            default :
                System.out.println("Invalid option choosed !!");

        }

    }
}
