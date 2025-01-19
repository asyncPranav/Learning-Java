package $07_Array;
import java.util.Scanner;

public class _10_right_rotate_array {
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

        //print original array
        System.out.print("\nOriginal array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        //right rotate array
        int temp = arr[arr.length-1];
        for(int i= arr.length-1; i>=1; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;


        //print rotated array
        System.out.print("\nRight rotated array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
