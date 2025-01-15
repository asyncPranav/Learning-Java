/*
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *

 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _30_Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        sc.close();

        //method-01 -> it print pattern but does not maintain tailing spaces
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r+i-1; j++){
                if(j>=r+i || j<=r-i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

        //method-02
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

        //method-03 -> it also print desired pattern but does not maintain tailing spaces
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r; j++){
                if(i+j>r){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }



    }
}
