//left rotate an array and store resultant array in same array

package $07_Array;
import java.util.Scanner;

public class _09_left_rotate_array {
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

        //left rotate an array -> Method-01
        /*
        int temp=0;
        for(int i=0; i<arr.length; i++){
            if(i==0){
                temp = arr[i];
            }else{
                arr[i-1] = arr[i];
            }
        }
        arr[arr.length-1] = temp;
         */

        //left rotate an array -> Method-02
        int temp=arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        //print rotated array
        System.out.print("\nLeft rotated array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
