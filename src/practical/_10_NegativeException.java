package practical;

import java.util.Scanner;

class NegativeException extends Exception{
    public NegativeException(){
        super("Negative number entered exception");
    }
}
/*class NegativeException extends Exception{
    public String toString(){
        return "Negative number entered exception";
    }
}*/
public class _10_NegativeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        try {
            if (n < 0) {
                throw new NegativeException();
            }else {
                System.out.println("You have entered : "+n);
            }
        }catch(NegativeException e){
            System.out.println(e);
        }finally {
            sc.close();
        }

    }
}
