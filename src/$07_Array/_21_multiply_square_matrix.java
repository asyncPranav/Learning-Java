package $07_Array;
import java.util.Scanner;

public class _21_multiply_square_matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //input size
        System.out.print("Square matrices are of order : ");
        int n = input.nextInt();

        //matrice declaration
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        //input elements of matrix A
        System.out.println("Enter elements of Marix A[] ->");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j] = input.nextInt();
            }
        }

        //input elements of matrix B
        System.out.println("Enter elements of Marix B[] ->");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                B[i][j] = input.nextInt();
            }
        }

        //print Matrix A
        System.out.println("\nMatrix A[] ->");
        for(int[] x : A){
            for(int y : x){
                System.out.format("%3d ",y);
            }
            System.out.println("");
        }

        //print Matrix B
        System.out.println("\nMatrix B[] ->");
        for(int[] x : B){
            for(int y : x){
                System.out.format("%3d ",y);
            }
            System.out.println("");
        }

        //declare resultant matrix C
        int[][] C = new int[n][n];

        //matrix multiplication
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        //print Matrix C
        System.out.println("\nResult matrix C[] ->");
        for(int[] x : C){
            for(int y : x){
                System.out.format("%3d ",y);
            }
            System.out.println("");
        }

    }
}
