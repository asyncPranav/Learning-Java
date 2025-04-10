/*
            *
          * *
        * * *
      * * * *
    * * * * *
  * * * * * *
* * * * * * *
*
 */

package patterns;

import java.util.Scanner;
public class pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=r; j++){
                if(j<=(r-i)){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}