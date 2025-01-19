// not fully correct, fail in some cases -> must check 08

package $07_Array;
import java.util.Scanner;

public class _07_second_largest_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input size of array
        System.out.print("Enter size of the array : ");
        int n = input.nextInt();

        //input array elements
        int[] arr = new int[n];
        System.out.println("Enter elements of array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        int second_largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                second_largest = max;
                max = arr[i];
            }
            else if(arr[i]>second_largest){
                second_largest = arr[i];
            }
        }

        //output second largest
        System.out.println("Max element : "+max);
        System.out.println("Second largest element : "+second_largest);
    }
}
