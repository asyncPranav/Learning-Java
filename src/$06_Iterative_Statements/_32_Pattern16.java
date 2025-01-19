/*
              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
    * * * * * * * * * * *
      * * * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *

 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _32_Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        sc.close();

        //for upper triangle
        for(int i=1; i<=r; i++){
            for(int j=1; j<=(2*r-1); j++){
                if(j>=r+i || j<=r-i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        //for lower triangle
        for(int i=1; i<=r-1; i++){
            for(int j=1; j<=2*r-1; j++){
                if(j<=i || j>=2*r-i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }

            }
            System.out.println("");
        }

    }
}
