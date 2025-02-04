package $08_Methods;
import java.util.Scanner;

public class _03_Max {
    static class FindMax{
        int max(int x, int y){
            if(x>y) return x;
            else return y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        //create object of class FindMax
        FindMax maxObject = new FindMax();

        //call method max()
        int result = maxObject.max(a,b);

        //output result
        System.out.println("Max : "+result);
    }
}
