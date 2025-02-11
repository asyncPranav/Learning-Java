package $08_Methods;
import java.util.Arrays;
import java.util.Scanner;

public class _14_Overloaded_method_to_reverse_number_and_array {

    //reverse a number
    static int reverse(int num){
        int rev=0;
        for (int i = num; i >0; i/=10) {
            int rem = i%10;
            rev = rev*10+rem;
        }
        return rev;
    }

    //reverse an array - LOGIC 1
    static void reverse(int[] arr){
        for(int i=0, j=arr.length-1; i<arr.length/2; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //reverse an array - LOGIC 2
    static int[] reverse(int[] arr, int n){
        int[] new_arr = new int[n];

        //reverse copy elements
        for(int i= arr.length-1, j=0; i>=0; i--, j++){
            new_arr[j] = arr[i];
        }
        return new_arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--------> Reverse number <-----------\n");

        //input number
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        //call overloaded method reverse -> to reverse the number
        System.out.println("Reverse of "+num+" : "+reverse(num));


        System.out.println("\n--------> Reverse array <---------\n");

        //input size
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        //array declaration
        int[] arr = new int[n];

        //input array elements
        System.out.println("Enter elements of array ->");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //print array
        System.out.println("Original array : "+Arrays.toString(arr));

        //call overloaded method reverse -> to reverse array
        reverse(arr);
        System.out.println("Reversed array : "+Arrays.toString(arr));

        //call overloaded method reverse LOGIC 2
        System.out.println("Re-reversed array : "+Arrays.toString(reverse(arr,n)));

    }
}
