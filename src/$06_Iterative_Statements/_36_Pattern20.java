/*
     *               *
     * *           * *
     * * *       * * *
     * * * *   * * * *
     * * * * * * * * *
     * * * *   * * * *
     * * *       * * *
     * *           * *
     *               *

 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _36_Pattern20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input row
        System.out.print("Enter odd number  of rows : ");
        int r = input.nextInt();
        System.out.println("");
        input.close();

        //pattern logic
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i < (r+1)/2) {
                    if (j<=i || j>r-i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                else if(i==(r+1)/2){
                    System.out.print("* ");
                }
                else {
                    if (j<=r+1-i || j>=i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }

            }
            System.out.println("");
        }

    }
}
