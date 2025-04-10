/*
    1
    2 3
    4 5 6
    7 8 9 10
 */

package patterns;

import java.util.Scanner;
public class pattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        int count = 0;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}