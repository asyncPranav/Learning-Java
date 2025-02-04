package $08_Methods;
import java.util.Scanner;

public class _10_Gcd_logic3 {
    /*
        Instead of repeatedly subtracting, we can use the modulus operator (%), which is a more efficient way to implement the Euclidean algorithm:
            1. Faster Execution: Instead of multiple subtractions, modulus directly reduces y to x % y, converging to the GCD more quickly.
            2. Fewer Iterations: The modulus version typically runs in O(log(min(x, y))) time complexity, whereas the subtraction-based version may take O(min(x, y)) steps in the worst case.
     */
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("GCD of "+x+" and "+y+" : "+gcd(x,y));

    }

}
