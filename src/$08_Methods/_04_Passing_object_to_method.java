package $08_Methods;
import java.util.Arrays;

public class _04_Passing_object_to_method {
    static void update(int X[]){
        X[0] = 25;
        X[3] = 78;
    }

    static void update2(int X[], int index, int value){
        X[index] = value;
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        System.out.println("A[] : "+Arrays.toString(A));
        update(A);
        System.out.println("A[] : "+Arrays.toString(A));

        int B[] = {5,6,7,8,9,0};
        System.out.println("B[] : "+Arrays.toString(B));
        update2(B,2,76);
        System.out.println("B[] : "+Arrays.toString(B));

    }
}
