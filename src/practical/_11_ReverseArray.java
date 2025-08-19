package practical;

import java.util.Arrays;

public class _11_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(arr));
        reverse1(arr);
        System.out.println(Arrays.toString(arr));
        reverse2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // method -01
    static void reverse1(int[] arr) {
        for (int i = 0, j = arr.length -1; i < arr.length/2; i++, j--) {
            swap(arr, i, j);
        }
    }

    // method-02
    static void reverse2(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
                start++;
                end--;
            }
    }

    //swap two element of array
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
