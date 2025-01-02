package $06_Iterative_Statements;
import java.util.Scanner;

public class _07_Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of row : ");
        int r = input.nextInt();
        System.out.print("Enter no of column : ");
        int c = input.nextInt();
        input.close();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+i);
            }
            System.out.println("");
        }
    }
}
