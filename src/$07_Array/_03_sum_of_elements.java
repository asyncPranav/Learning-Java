package $07_Array;
import java.util.Scanner;

public class _03_sum_of_elements {
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

        //sum of all elements
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        //output sum
        System.out.println("Total Sum : "+sum);
    }
}
