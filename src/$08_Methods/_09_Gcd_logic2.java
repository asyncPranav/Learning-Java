package $08_Methods;
import java.util.Scanner;

public class _09_Gcd_logic2 {
    /*
        gcd function implements the subtraction-based Euclidean algorithm, which correctly calculates the Greatest Common Divisor (GCD). However, this method can be improved in terms of efficiency.
        How It Works:
            1. The function keeps subtracting the smaller number from the larger one until both numbers become equal.
            2. Once x == y, that value is the GCD.
     */
    static int gcd(int x, int y){
        while(x!=y){
            if(x>y){
                x = x-y;
            }else{
                y = y-x;
            }
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
