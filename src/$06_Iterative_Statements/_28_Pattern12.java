/*
    * * * * *
      * * * *
        * * *
          * *
            *
*/

package $06_Iterative_Statements;
import java.util.Scanner;

public class _28_Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        sc.close();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                //method-01
                if(j<i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }

                //method-02
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

                //method-03
                if(i<=j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }
}
