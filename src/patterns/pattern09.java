/*
              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
    * * * * * * * * * * *

 */
package patterns;

import java.util.Scanner;

public class pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();

        for(int i=1, space = r-1, star = 1; i<=r; i++, space--, star+=2){
            System.out.print("  ".repeat(space));
            System.out.println("* ".repeat(star));
        }
    }
}
