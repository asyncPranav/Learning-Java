package $07_Array;

public class _18_2D_array {
    public static void main(String[] args) {

        //2D-array declaration
        int A[][] = new int[3][4];
        int[][] B = new int[3][4];
        int[][] C;
        C = new int[3][4];
        int[]H[] = new int[3][4];


        //2D-array initialisation
        int D[][] = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int[][] E = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int[][] F;
        F = new int[][]{{1,2,3,4},{5,6,7,8},{3,5,1,4}};

        //accessing element of 2D-array using for loop
        System.out.println("array accessed using for loop : ");
        for(int i=0; i<F.length; i++){
            for(int j=0; j<F[0].length; j++){
                System.out.print(F[i][j]+" ");
            }
            System.out.println("");
        }

        //accessing element of 2D-array using for-each loop
        System.out.println("\narray accessed using for-each loop : ");
        for(int x[] : F){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }

        //jagged array creation
        int[][] G;
        G = new int[3][];
        G[0] = new int[2];
        G[1] = new int[4];
        G[2] = new int[3];

        //print jagged array using for loop
        System.out.println("\nJagged array :");
        for(int i=0; i<G.length; i++){
            for(int j=0; j<G[i].length; j++){
                System.out.print(G[i][j]+" ");
            }
            System.out.println("");
        }

        //print jagged array using for-each loop
        System.out.println("\nJagged array :");
        for (int x[] : G) {
            for (int j : x) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
}
