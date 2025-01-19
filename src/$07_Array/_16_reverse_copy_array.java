package $07_Array;
import java.util.Scanner;

public class _16_reverse_copy_array {
    public static void main(String[] args) {

        //input size of the array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = input.nextInt();

        //array declaration
        int[] arr = new int[n];

        //input array elements
        System.out.println("Enter elements of the array : ");
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        //print original array
        System.out.print("Original array : ");
        for(int x : arr){
            System.out.print(x + " ");
        }

        //declare new array
        int[] new_arr = new int[n];

        //reverse copy elements
        for(int i= arr.length-1, j=0; i>=0; i--, j++){
            new_arr[j] = arr[i];
        }

        //output copied array
        System.out.print("\nCopied array : ");
        for(int x : new_arr){
            System.out.print(x+" ");
        }













    }
}
