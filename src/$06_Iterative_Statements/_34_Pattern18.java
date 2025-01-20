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

public class _34_Pattern18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input row
        System.out.print("Enter no of columns : ");
        int c = input.nextInt();
        System.out.println("");
        input.close();

        //pattern logic
        for(int i=1; i<=2*c-1; i++){
            for(int j=1; j<=c; j++){
                if(i<=c){
                    if(j<=i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(j<=2*c-i){
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
