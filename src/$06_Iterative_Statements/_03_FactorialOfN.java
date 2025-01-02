package $06_Iterative_Statements;
import java.util.Scanner;

public class _03_FactorialOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int n = input.nextInt();
        long factorial=1L;
        for(int i=n; i>0; i--){
            factorial = factorial*i;
        }
        System.out.println("Factorial of "+n+" : "+factorial);
    }
}