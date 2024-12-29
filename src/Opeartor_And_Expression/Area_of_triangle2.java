package Opeartor_And_Expression;
import java.util.Scanner;

public class Area_of_triangle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, c;
        System.out.print("Enter all sides of triangle : ");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        //float s = (float)1/2*(a+b+c);
        float s = (a+b+c)/2f;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); //sqrt returns double that's why we declare area as double
        System.out.println("Area of triangle : "+area);
    }
}
