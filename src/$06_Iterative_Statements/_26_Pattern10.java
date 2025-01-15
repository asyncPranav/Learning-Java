/*
     1
     2  3
     4  5  6
     7  8  9 10
 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _26_Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        sc.close();

        int counter = 0;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                counter++;
                System.out.printf("%2d ",counter);
            }
            System.out.println("");
        }
    }
}
