package $05_Conditional_Statements;
import java.util.Scanner;

public class _07_Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        if(a>=b && a>=c){
            System.out.println("Max : " + a);
        }else if(b>c){
            System.out.println("Max : " + b);
        }else{
            System.out.println("Max : " + c);
        }
    }
}
