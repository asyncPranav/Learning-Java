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

package patterns;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();

        for(int i=1, space=r-1, star=1; i<=r; i++, space--, star+=2){
            System.out.print("  ".repeat(space));
            System.out.print("* ".repeat(star));
            System.out.println("  ".repeat(space));
        }
        for(int i=1, space=1, star=2*r-3; i<=r-1; i++, space++, star-=2){
            System.out.print("  ".repeat(space));
            System.out.print("* ".repeat(star));
            System.out.println("  ".repeat(space));
        }

        //method-02
        for (int i = 1; i <= r; i += 2) {
            int spaces = (r - i) / 2;
            System.out.println("  ".repeat(spaces) + "* ".repeat(i));
        }
        for (int i = r - 2; i >= 1; i -= 2) {
            int spaces = (r - i) / 2;
            System.out.println("  ".repeat(spaces) + "* ".repeat(i));
        }

    }
}
