package $08_Methods;
import java.util.Scanner;

public class _08_Gcd {

    //this is most optimized
    static int gcd(int x, int y){
        //int small = (x<=y) ? x : y;
        int small = Math.min(x,y);
        for(int i=small; i>=1; i--){
            if(x%i==0 && y%i==0) return i;
        }
        return 1;
    }

    //yes it is correct but its more optimised to use decrement loop because you have to find greatest common divisor, and it will be obtain from last
    static int gcd_method_2(int x, int y){
        int small = Math.min(x,y);
        int val=0;
        for(int i=1; i<=small; i++){
            if(x%i==0 && y%i==0){
                val = i;
            }
        }
        return val;
    }

    static int gcd_method_3(int x, int y){
        int small = Math.min(x,y);
        int val=0;
        for(int i=small; i>=1; i--){
            if(x%i==0 && y%i==0){
                val = i;
                break;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("GCD of "+x+" and "+y+" : "+gcd(x,y));

    }
}
