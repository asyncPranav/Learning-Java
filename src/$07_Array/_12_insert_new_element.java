//insert new element in the same array

package $07_Array;
import java.util.Scanner;

public class _12_insert_new_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input size of array
        System.out.print("Enter size of the array : ");
        int n = input.nextInt();

        //input array elements
        int[] arr = new int[100];
        System.out.println("Enter elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        //print original array
        System.out.print("Original array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //input new element and its location
        System.out.print("\n\nEnter element that you wanna insert : ");
        int inserting_element = input.nextInt();
        System.out.print("enter location of new element : ");
        int inserting_location = input.nextInt();

        //check location is valid or not
        if(inserting_location>=n){
            System.out.println("Invalid location !!");
            System.exit(0);
        }

        //right shift element that lie after inserting element
        for(int i=n-1; i>=inserting_location; i--){
            arr[i+1] = arr[i];
        }

        //insert inserting element
        arr[inserting_location] = inserting_element;

        //print inserted array
        System.out.print("Inserted array : ");
        for (int i = 0; i < n+1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
