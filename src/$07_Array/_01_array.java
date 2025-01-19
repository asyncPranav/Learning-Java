package $07_Array;

public class _01_array {
    public static void main(String[] args) {

        //--------------->Array declaration<------------------

        int arr1[] = new int[5]; //c style type declaration

        int[] arr4; //declaration and assignment
        arr4 = new int[5];

        int[] arr2 = new int[5]; //java style type declaration
        System.out.println(arr1.length);
        System.out.println(arr2.length);

        //-------------------->Array initialisation<---------------------------
        arr2[0] = 4;
        arr2[3] = 5;

        int arr3[] = {1,2,3,4,5,6,7};
        //int[] arr3 = {1,2,3,4,5,6,7};

        /*
        int[] arr3;
        arr3 = new int[]{1,2,3,4,5,6,7};
        */

        //---------------->print whole array<----------------------
        System.out.print("arr[2] : ");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

        System.out.println("");
        System.out.print("arr[7] : ");
        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }

        //print array using for each loop
        System.out.println("");
        System.out.print("arr[2] : ");
        for(int x : arr2){
            System.out.print(x + " ");
        }




    }
}
