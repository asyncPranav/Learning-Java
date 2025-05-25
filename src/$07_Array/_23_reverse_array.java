package $07_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _23_reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arr : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input an array
        System.out.println("Enter elements of arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed arr : " + Arrays.toString(arr));

        // reverse an array
        for (int i = 0, j=arr.length-1; i < arr.length/2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("Original arr : " + Arrays.toString(arr));
    }
}
