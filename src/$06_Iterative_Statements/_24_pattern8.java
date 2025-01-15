/*
    01 02 03 04 05 06 07
    08 09 10 11 12 13 14
    15 16 17 18 19 20 21
    22 23 24 25 26 27 28
    29 30 31 32 33 34 35
 */

package $06_Iterative_Statements;
import java.util.Scanner;

public class _24_pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int c = sc.nextInt();
        sc.close();

        int counter=0;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                counter++;
                //System.out.print(i*j+" "); //does not produce any space to maintain box like structure
                //System.out.format("%2d ",counter); //it give spaces dint fill vacant space
                System.out.format("%02d ",counter);

            }
            System.out.println("");
        }

    }
}
