package $06_Iterative_Statements;
import java.util.Scanner;

public class _09_Palindrome_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        int rev=0;
        for(int i=num; i>0; i/=10){
            int rem = i%10;
            rev = rev*10 + rem;
        }

        if(rev==num){
            System.out.println(num+" is palindrome");
        }else{
            System.out.println(num+" is not palindrome");
        }

    }
}
