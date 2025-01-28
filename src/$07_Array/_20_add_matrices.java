package $07_Array;
import java.util.Scanner;

public class _20_add_matrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input matrix A[]
        System.out.print("No of rows of A[] : ");
        int r1 = input.nextInt();
        System.out.print("No of columns of A[] : ");
        int c1 = input.nextInt();

        int[][] A = new int[r1][c1];
        System.out.println("Enter elements of matrix A[] ->");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                A[i][j] = input.nextInt();
            }
        }

        //input matrix B[]
        System.out.print("No of rows of B[] : ");
        int r2 = input.nextInt();
        System.out.print("No of columns of B[] : ");
        int c2 = input.nextInt();

        //check if addition is valid or not
        if(r1==r2 && c1==c2){
            int[][] B = new int[r1][c1];
            System.out.println("Enter elements of matrix B[] ->");
            for(int i=0; i<B.length; i++){
                for(int j=0; j<B[0].length; j++){
                    B[i][j] = input.nextInt();
                }
            }

            //print matrix A[]
            System.out.println("\nMatrix A[] ->");
            for(int[] x : A){
                for(int y : x){
                    System.out.format("%3d ",y);
                }
                System.out.println("");
            }

            //print matrix B[]
            System.out.println("\nMatrix B[] ->");
            for(int[] x : B){
                for(int y : x){
                    System.out.format("%3d ",y);
                }
                System.out.println("");
            }

            //add two matrices
            int[][] C = new int[r1][c1];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<A[0].length; j++){
                    C[i][j] = A[i][j]+B[i][j];
                }
            }

            //print Resultant matrix
            System.out.println("\nResultant matrix ->");
            for(int[] x : C){
                for(int y : x){
                    System.out.format("%3d ",y);
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("\nERROR : for matrix addition row and columns of both matrices must be same...!!");
        }

    }
}
