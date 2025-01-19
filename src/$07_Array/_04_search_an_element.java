package $07_Array;
import java.util.Scanner;

public class _04_search_an_element {
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

        //input target element
        System.out.print("Enter element that you wanna search : ");
        int target = input.nextInt();

        //search element
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Element "+target+" found at index value : "+i);
                System.exit(0);
            }
        }
        System.out.println("Element not found !!");

    }
}
