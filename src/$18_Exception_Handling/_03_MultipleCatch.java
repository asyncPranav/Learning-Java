package $18_Exception_Handling;

import java.util.Arrays;
import java.util.Scanner;

public class _03_MultipleCatch {

    private static void handleArrayOperations(int[] arr) {
        try {
            int result = arr[1] / arr[0];

            // This will cause ArithmeticException, when arr[0] = 0
            System.out.println("Result of arr[1] / arr[0]: " + result);

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println("10th element of array: " + arr[10]);
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator cant be zero");
            System.out.println("Error caused by -> " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index cant be greater than array.length-1");
            System.out.println("Error caused by -> " + e);
        }

        /* --> can collapse above both catch statements
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caused by -> " + e);
        }

         */

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First case: First element should be zero
        int[] numbers = new int[4];
        System.out.println("Enter 4 elements (first should be zero):");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("numbers array: " + Arrays.toString(numbers));

        handleArrayOperations(numbers);

        // Second case: First element should not be zero
        int[] values = new int[4];
        System.out.println("\nEnter 4 elements (first should NOT be zero):");
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        System.out.println("values array: " + Arrays.toString(values));

        handleArrayOperations(values);

        sc.close();
    }
}
