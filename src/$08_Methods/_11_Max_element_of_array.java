package $08_Methods;

import java.util.Scanner;

public class _11_Max_element_of_array {

    //method to find max element
    static int max(int[] A){
        int maxElement = Integer.MIN_VALUE;

        /* -> using for loop
            for (int i = 0; i < A.length; i++) {
                if (A[i]>maxElement){
                    maxElement = A[i];
                }
            }
         */

        // using for each loop
        for (int x : A) {
            if (x > maxElement) {
                maxElement = x;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input size of array
        System.out.print("Size of array : ");
        int n = sc.nextInt();

        //declare array
        int[]A = new int[n];

        //input array elements
        System.out.println("Enter elements of the array ->");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        //call max method
        int result = max(A);

        //output max element
        System.out.println("Max element : "+result);

    }
}
