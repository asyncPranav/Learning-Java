package $06_Iterative_Statements;

import java.util.Scanner;

public class _02_SumOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum of first "+n+" terms : "+sum);
    }
}
