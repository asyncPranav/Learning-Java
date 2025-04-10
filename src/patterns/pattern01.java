package patterns;

import java.util.Scanner;
public class pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}