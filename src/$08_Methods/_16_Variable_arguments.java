package $08_Methods;

import java.util.Arrays;

public class _16_Variable_arguments {
    static void show(int...x){
        for(int a : x){
            System.out.print(a+" ");
        }
        //using this way of printing array show that when no parameter is passed then it  print empty array or null
        System.out.println("\n"+Arrays.toString(x));
    }

    static void foo(int[] x){
        for(int a : x){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        show(); //does not print anything 
        System.out.println("");
        show(10,20,30);
        System.out.println("");
        show(1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1);
        System.out.println("");
        show(new int[]{11,12,13,14,15});
        System.out.println("");

        //foo() method will accept passing an array as a parameter but it will not accept passing variable arguments as a parameter
        foo(new int[]{1,2,3,4});
        System.out.println("");
        //foo(1,2,3,4); --> error

    }
}
