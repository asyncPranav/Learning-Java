package college;
import java.util.Scanner;

public class MinMaxElement {

    // Method to find the minimum element in an array
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Method to find the maximum element in an array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number of elements must be positive.");
        } else {
            int[] array = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            int min = findMin(array);
            int max = findMax(array);

            System.out.println("Minimum element: " + min);
            System.out.println("Maximum element: " + max);
        }

        sc.close(); // Close the Scanner object
    }
}
