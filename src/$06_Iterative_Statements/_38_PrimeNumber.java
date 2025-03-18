package $06_Iterative_Statements;
import java.util.Scanner;

public class _38_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n<2){
            System.out.println("No, "+n+" is not prime");
            System.exit(0);
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println("No, "+n+" is not prime");
                System.exit(0);
            }
        }
        System.out.println("Yes, "+n+" is prime");
    }

}