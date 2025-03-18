package $06_Iterative_Statements;

import java.util.Scanner;

public class _40_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("not Armstrong");
            System.exit(0);
        }

        int digits=0;
        for(int i=n; i>0; i/=10){
            digits++;
        }

        int sum=0;
        for(int i=n; i>0; i/=10){
            int rem = i%10;
            int power = (int)Math.pow(rem, digits);
            sum += power;
        }

        if(sum==n){
            System.out.println("yes Armstrong");
        }
        else{
            System.out.println("not Armstrong");
        }
    }
}

/*----> According to ChatGPT

    1. Digit count loop fails for n = 0
        -> Problem: When n = 0, the condition i > 0 is false from the start, so the loop never executes.
        -> Effect: digits remains 0, which causes issues in the next calculations.

    2. Incorrect use of Math.pow(rem, digits)
        -> Since digits = 0 for n = 0, Math.pow(0, 0) is evaluated.
        -> Java defines 0^0 = 1, which leads to incorrect logic.

 */
