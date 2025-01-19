//insert a new element and store result inn new array

package $07_Array;
import java.util.Scanner;

public class _11_insert_new_element {
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
        System.out.print("Original array : ");
        for(int x : arr){
            System.out.print(x+" ");
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

        //new array declaration
        int[] new_arr = new int[n+1];

        //insert element preceding inserting location
        int i,j;
        for(i=0, j=0; i<inserting_location; i++, j++){
            new_arr[j] = arr[i];
        }

        //insert inserting element
        new_arr[j++] = inserting_element;

        //insert element preceding inserting location
        for(; i<arr.length; i++, j++){
            new_arr[j] = arr[i];
        }

        //print new array
        System.out.print("Inserted array : ");
        for(int x : new_arr){
            System.out.print(x+" ");
        }





    }
}
