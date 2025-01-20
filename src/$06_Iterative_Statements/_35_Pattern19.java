/*
        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *

 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _35_Pattern19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input row
        System.out.print("Enter no of columns : ");
        int c = input.nextInt();
        System.out.println("");
        input.close();

        //pattern logic-01
        for(int i=1; i<=2*c-1; i++){
            for(int j=1; j<=c; j++){
                if(i<=c){
                    if(j>c-i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(j>i-c){
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
