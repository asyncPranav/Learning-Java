package $08_Methods;
import java.util.Scanner;

public class _07_Prime_number {
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else{
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check prime or not : ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
    }
}