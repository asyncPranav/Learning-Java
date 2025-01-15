/*
     1  2  3  4  5
     1  2  3  4
     1  2  3
     1  2
     1
 */
package $06_Iterative_Statements;
import java.util.Scanner;

public class _27_Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        sc.close();

        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2d ",j);
            }
            System.out.println("");
        }
    }
}
