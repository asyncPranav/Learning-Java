package $05_Conditional_Statements;
import java.util.Scanner;

public class _09_Arrange_num {
    public static void main(String[] args) {

        //input three numbers from user and arrange them in ascending order
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        if(a<=b && a<=c){
            if(b<=c){
                System.out.printf("Order : %d %d %d\n",a,b,c);
            }else{
                System.out.printf("Order : %d %d %d\n",a,c,b);
            }
        }
        else if(b<=a && b<=c){
            if(c<=a){
                System.out.printf("Order : %d %d %d\n",b,c,a);
            }else{
                System.out.printf("Order : %d %d %d\n",b,a,c);
            }
        }
        else{
            if (a<=b){
                System.out.printf("Order : %d %d %d\n",c,a,b);
            }else{
                System.out.printf("Order : %d %d %d\n",c,b,a);
            }
        }


    }
}
