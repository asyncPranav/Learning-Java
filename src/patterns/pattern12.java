/*

          *
        * *
      * * *
    * * * *
  * * * * *
* * * * * *


 */
package patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();

        //method-01
        for(int i=1, space = r-i, star = 1; i <= r; i++, space--, star++){
            System.out.print("  ".repeat(space));
            System.out.println("* ".repeat(star));
        }

        //method-02
        for(int i=1; i<=r; i++){
            System.out.print("  ".repeat(r-i));
            System.out.println("* ".repeat(i));
        }
    }
}
