package $06_Iterative_Statements;
import java.util.Scanner;

public class _10_Armstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        //count digits
        int digits=0;
        for(int i=num; i>0; i/=10){
            digits++;
        }

        //check armstrong
        double sum=0;
        for(int i=num; i>0; i/=10){
            int rem = i%10;
            double power = Math.pow(rem, digits);
            sum = sum+power;
        }
        if(sum==num){
            System.out.println(num+" is Armstrong !!");
        }else{
            System.out.println(num+" is not Armstrong !!");
        }

    }
}
