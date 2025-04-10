/*

    * * * * * * * * * * *
      * * * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *

 */
package patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();

        for(int i=1, space = 0, star = 2*r-1; i <= r; i++, space++, star -= 2){
            System.out.print("  ".repeat(space));
            System.out.println("* ".repeat(star));
        }
    }
}
