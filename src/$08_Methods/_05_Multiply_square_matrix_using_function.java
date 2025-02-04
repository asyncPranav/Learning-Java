package $08_Methods;
import java.util.Scanner;

public class _05_Multiply_square_matrix_using_function {
    static Scanner input = new Scanner(System.in);

    //input array
    static void inputMatrix(int[][] A, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j] = input.nextInt();
            }
        }
    }

    //print array
    static void printMatrix(int[][] A, int n){
        for(int[] x : A){
            for(int y : x){
                System.out.format("%3d ",y);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){

        //input size
        System.out.print("Square matrices are of order : ");
        int n = input.nextInt();

        //matrice declaration
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        //input elements of matrix A
        System.out.println("Enter elements of Marix A[] ->");
        inputMatrix(A,n);

        //input elements of matrix B
        System.out.println("Enter elements of Marix B[] ->");
        inputMatrix(B,n);

        //print Matrix A
        System.out.println("\nMatrix A[] ->");
        printMatrix(A,n);

        //print Matrix B
        System.out.println("\nMatrix B[] ->");
        printMatrix(B,n);

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
        System.out.println("\nResultant matrix C[] ->");
        printMatrix(C,n);

    }

}
