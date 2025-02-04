//static method can call only static method , so you have to make method max() as static

package $08_Methods;
import java.util.Scanner;

public class _01_Max {
    static int max(int x, int y){
        if(x>y) return x;
        else return y;
    }
    static int max2(int x, int y){
        return Math.max(x, y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        //call max function
        int result = max(a,b);

        //output max
        System.out.println("Max : "+result);

    }
}
