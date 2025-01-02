package $06_Iterative_Statements;
import java.util.Scanner;

public class _04_ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int rev = 0;
        input.close();
        for(int i=n; i>0; i/=10){
            int rem = i%10;
            rev = rev*10+rem;
        }
        System.out.println("Reversed Number : "+rev);
    }
}
