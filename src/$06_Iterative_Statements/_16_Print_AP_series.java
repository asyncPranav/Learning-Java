package $06_Iterative_Statements;
import java.util.Scanner;

public class _16_Print_AP_series {
    public static void main(String[] args) {

        //take first term, common difference and no of terms from user and print AP series
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term of AP : ");
        int a = sc.nextInt();
        System.out.print("Enter common difference of AP : ");
        int r = sc.nextInt();
        System.out.print("Enter no of term you want : ");
        int n = sc.nextInt();

        //print AP
        for(int i=0; i<n; i++){
            if(i==0){
                System.out.print(a+" ");
            }else{
                a = a+r;
                System.out.print(a+" ");
            }
        }

    }
}
