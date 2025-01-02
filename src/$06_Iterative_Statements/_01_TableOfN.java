package $06_Iterative_Statements;

import java.util.Scanner;

public class _01_TableOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        for(int i=1; i<=10; i++){
            System.out.print(i*n + " ");
        }
    }
}
