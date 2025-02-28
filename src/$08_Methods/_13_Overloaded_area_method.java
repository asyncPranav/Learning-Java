package $08_Methods;
import java.util.Scanner;

public class _13_Overloaded_area_method {

    //area of circle
    static float area(float r){
        return (float)Math.PI*r*r; //we have to cast result to float because Math.PI returns double by default
    }

    //area of rectangle
    static float area(float l, float b){
        return l*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<-------------Area Of Circle------------->\n");
        System.out.print("Enter radius : ");
        float r = sc.nextFloat();

        //call method area -> for area of circle calculation
        System.out.println("Area of circle : "+area(r));

        System.out.println("\n<-------------Area Of Rectangle------------->\n");
        System.out.print("Enter length and breadth : ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();

        //call method area -> for area of rectangle calculation
        System.out.println("Area of rectangle : "+area(l,b));

    }
}
