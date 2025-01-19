package $07_Array;

import java.util.Arrays;

public class _17_increase_size_of_array {
    public static void main(String[] args) {

        //original array
        int[] A = {1,2,3,4,5};
        System.out.println("Length of A : "+A.length);

        //output original array
        System.out.print("Original array : ");
        for(int x : A){
            System.out.print(x+" ");
        }

        //new array with larger size
        int[] B = new int[10];

        //copy elements
        for(int i=0, j=0; i<5; i++, j++){
            B[j] = A[i];
        }

        //re-reference array
        A = B;
        B = null;

        //length of A after resizing
        System.out.println("\nLength of A after increasing size : "+A.length);

        //output Resized array
        System.out.print("Resized array : ");
        for(int x : A){
            System.out.print(x+" ");
        }

        //array can be printed in this way too
        System.out.println("\n\nOriginal Array : "+ Arrays.toString(A));

    }
}
