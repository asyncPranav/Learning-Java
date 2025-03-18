package $06_Iterative_Statements;
import java.util.Scanner;

public class _11_Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        int count=0;

        /* ---> fail when { num=0 } , it gives digits : 0

            for(int i=num; i>0; i/=10){
                count++;
            }

         */

        for(int i=num; i>0 || count==0; i/=10){
            count++;
        }

        System.out.println("Number of digits : "+count);

    }
}
