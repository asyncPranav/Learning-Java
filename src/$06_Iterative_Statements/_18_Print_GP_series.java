package $06_Iterative_Statements;

import java.util.Scanner;

public class _18_Print_GP_series {
    public static void main(String[] args) {

        //take first term, common difference and no of terms from user and print GP series
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term of GP : ");
        int a = sc.nextInt();
        System.out.print("Enter common difference of GP : ");
        int r = sc.nextInt();
        System.out.print("Enter no of term you want : ");
        int n = sc.nextInt();

        //print AP
        int term = a;
        for(int i=0; i<n; i++){
            System.out.print(term+" ");
            term = term*r;
        }

    }
}
