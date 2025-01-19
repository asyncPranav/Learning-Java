//one error -> if we provide random target element that does not exit in the array thereafter it give wrong resultant array

package $07_Array;
import java.util.Scanner;

public class _13_delete_an_element {
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
        System.out.print("Array before : ");
        for(int x : arr){
            System.out.print(x + " ");
        }

        //input element to delete
        System.out.print("\nEnter element that you wanna delete : ");
        int target = input.nextInt();

        //find location of target element
        int target_location=0;
        for(int i=0; i<n; i++){
            if(target==arr[i]){
                target_location = i;
            }
        }

        //delete target element from array
        for(int i=target_location; i<n-1; i++){
            arr[i] = arr[i+1];
        }

        //output resultant array
        System.out.print("Array  after : ");
        for(int i=0; i<n-1; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
