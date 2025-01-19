// fully working for all cases

package $07_Array;
import java.util.Scanner;

public class _08_second_largest_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input size of array
        System.out.print("Enter size of the array : ");
        int n = input.nextInt();

        //handle size of array
        if(n<2){
            System.out.println("Array size must be at least 2 !!!");
            System.exit(0);
        }

        //input array elements
        int[] arr = new int[n];
        System.out.println("Enter elements of array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        //find largest and second largest element
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int x : arr){
            if(x>largest){
                second_largest = largest;
                largest = x;
            }
            else if(x>second_largest && x<largest){
                second_largest = x;
            }
        }

        //handle case where second largest does not exist
        if(second_largest == Integer.MIN_VALUE){
            System.out.println("All elements are equal !!!!");
        }
        else{
            //output largest and second largest
            System.out.println("Largest : " + largest);
            System.out.println("Second largest : " + second_largest);
        }
    }
}
