package $06_Iterative_Statements;
import java.util.Scanner;

public class _19_Fibonacci_series {
    public static void main(String[] args) {

        //take no of term from user print fibonacci series up to that term
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of term you want : ");
        int n = sc.nextInt();

        //print fibonacci series;
        int a=0, b=1, c;
        for(int i=0; i<n; i++){
            if(i<=1){
                c = i;
            }else{
                c = a+b;
                a = b; //this line must be written before b=c , if you write after b=c then program will not run as expected
                b = c;
            }
            System.out.print (c+" ");

        }
    }
}
