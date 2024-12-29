package Opeartor_And_Expression;
import java.util.Scanner;

public class Area_of_triangle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base, height;
        System.out.print("Enter base and height of triangle : ");
        base = input.nextFloat();
        height = input.nextFloat();
        //float area = (float)1/2*base*height;
        //float area = 1f/2*base*height;
        float area = 0.5f*base*height;

        System.out.println("Area of triangle : "+area);
        input.close();
    }
}
