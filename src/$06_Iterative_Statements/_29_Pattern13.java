/*
            *
          * *
        * * *
      * * * *
    * * * * *
 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _29_Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        sc.close();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                //method-01
                if(j<=r-i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }

                //method-02
                if(i+j>r){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }


            }
            System.out.println("");
        }

    }
}
