package $06_Iterative_Statements;
import java.util.Scanner;

public class _08_Multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        input.close();
        for(int i=1; i<=10; i++){
            //System.out.println(n + " x " + i + " = " + (n*i));
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }

    }
}
