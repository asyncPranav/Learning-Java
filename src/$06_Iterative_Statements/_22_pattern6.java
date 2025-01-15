/*
    2 3 4 5 6
    3 4 5 6 7
    4 5 6 7 8
    5 6 7 8 9
 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _22_pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int c = sc.nextInt();
        sc.close();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(i+j+" ");
            }
            System.out.println("");
        }

    }
}
