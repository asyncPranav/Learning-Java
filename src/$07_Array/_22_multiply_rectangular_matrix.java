package $07_Array;
import java.util.Scanner;

public class _22_multiply_rectangular_matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //input dimension of matrix A
        System.out.print("Enter no of rows of A[] : ");
        int r1 = input.nextInt();
        System.out.print("Enter no of columns of A[] : ");
        int c1 = input.nextInt();

        //input dimension of matrix A
        System.out.print("Enter no of rows of B[] : ");
        int r2 = input.nextInt();
        System.out.print("Enter no of columns of B[] : ");
        int c2 = input.nextInt();

        //matrice declaration
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];

        //check if multiplication is valid
        if(c1==r2){

            //input elements of matrix A
            System.out.println("Enter elements of Marix A[] ->");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    A[i][j] = input.nextInt();
                }
            }

            //input elements of matrix B
            System.out.println("Enter elements of Marix B[] ->");
            for(int i=0; i<r2; i++){
                for(int j=0; j<c2; j++){
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
            int[][] C = new int[r1][c2];

            //matrix multiplication
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    for(int k=0; k<c1; k++){
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
        else{
            System.out.println("ERROR : multiplication is not valid..!!");
            System.exit(0);
        }

    }
}
