/*
    * * * * * * *
    *           *
    *           *
    * * * * * * *

 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _33_Pattern17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input row
        System.out.print("Enter no of rows : ");
        int r = input.nextInt();

        //input column
        System.out.print("Enter no of columns : ");
        int c = input.nextInt();

        //close input
        System.out.println("");
        input.close();

        //pattern logic
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(i==1 || i==r){
                    System.out.print("* ");
                }else{
                    if(j==1 || j==c){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }

    }
}
