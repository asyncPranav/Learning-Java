//you can also call method via creating object of the class where your method is present

package $08_Methods;
import java.util.Scanner;

public class _02_Max {
    int max(int x, int y){
        if(x>y) return x;
        else return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        //creating object of "_02_Max" class
        _02_Max maxObject = new _02_Max();

        //call max function
        int result = maxObject.max(a,b);

        //output max
        System.out.println("Max : "+result);

    }
}
