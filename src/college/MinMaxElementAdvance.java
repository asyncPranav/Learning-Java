package college;
import java.util.Scanner;

public class MinMaxElementAdvance {

    // Method to find the minimum element in an array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to find the maximum element in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input, Enter an Integer.");
            sc.next(); // Clear the invalid input
            System.out.print("\nEnter size of Array: ");
        }
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size of Array must be positive.");
        } else {
            int[] arr= new int[n];
            System.out.println("\nEnter elements of the Array:");
            for (int i = 0; i < n; i++) {
                System.out.print("arr[" +i+ "] : ");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next(); // Clear the invalid input
                    System.out.print("arr[" +i+ "] : ");
                }
                arr[i] = sc.nextInt();
            }

            int min = findMin(arr);
            int max = findMax(arr);

            System.out.println("\nMin element: " + min);
            System.out.println("Max element: " + max);
        }

        sc.close(); // Close the Scanner object
    }
}

