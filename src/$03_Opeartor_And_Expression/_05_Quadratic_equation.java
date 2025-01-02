package $03_Opeartor_And_Expression;
import java.util.Scanner;

public class _05_Quadratic_equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter coefficient a,b,c of the eqn : ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        //sqrt returns double that's why "D" is declared double
        double D = Math.sqrt(b * b - 4 * a * c); //we will get NaN if sq root is over negative number
        double root1 = (-b + D) / (2 * a);
        double root2 = (-b - D) / (2 * a);

        System.out.println("Roots of the eqn are "+root1+" "+root2);
    }
}

