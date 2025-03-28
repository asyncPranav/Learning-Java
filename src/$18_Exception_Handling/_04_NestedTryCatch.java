package $18_Exception_Handling;

import java.util.Arrays;
import java.util.Scanner;

public class _04_NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[4];

        /*
        try {
            System.out.println("Enter 4 elements (first should be zero):");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }
            System.out.println("numbers array: " + Arrays.toString(numbers));

            try{
                int result = numbers[1] / numbers[0]; //ArithmeticException
                System.out.println("Result of arr[1] / arr[0]: " + result);
            }
            catch (ArithmeticException e){
                System.out.println("Error is caused by -> "+e);
            }

            System.out.println("10th element of array : "+numbers[10]); //ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error is caused by -> "+e);
        }

        */

        System.out.println("Enter 4 elements (first should be zero):");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("numbers array: " + Arrays.toString(numbers));

        try {
            System.out.println("10th element of array : "+numbers[10]); //ArrayIndexOutOfBoundsException

            try{
                int result = numbers[1] / numbers[0]; //ArithmeticException
                System.out.println("Result of arr[1] / arr[0]: " + result);
            }
            catch (ArithmeticException e){
                System.out.println("Error is caused by -> "+e);
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error is caused by -> "+e);
        }
    }
}
