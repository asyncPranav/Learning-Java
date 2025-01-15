/*
    1 1 1 1 1 1
    2 2 2 2 2 2
    3 3 3 3 3 3
    4 4 4 4 4 4
    5 5 5 5 5 5
 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _21_pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int c = sc.nextInt();
        sc.close();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }

    }
}
