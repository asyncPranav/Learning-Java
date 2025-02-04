package $08_Methods;
import java.util.Scanner;

public class _06_Swap_variable {
    static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;

        System.out.println("A : "+x+", B : "+y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();

        //before swapping
        System.out.println("A : "+a+", B : "+b);

        //after swapping
        swap(a,b);
    }
}
