/*
      1   2   3   4   5   6
      2   4   6   8  10  12
      3   6   9  12  15  18
      4   8  12  16  20  24
      5  10  15  20  25  30

 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _23_pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int c = sc.nextInt();
        sc.close();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                //System.out.print(i*j+" ");
                System.out.printf("%3d ",i*j);
            }
            System.out.println("");
        }

    }
}
