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

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();

        //method-01
        for(int i=1, star = 1; i <= r; i++, star++){
            System.out.println("* ".repeat(star));
        }

        //method-02
        for(int i=1; i<=r; i++){
            System.out.println("* ".repeat(i));
        }
    }
}
