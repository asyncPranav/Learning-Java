package $03_Opeartor_And_Expression;
import java.util.Scanner;

public class _04_Cuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float l, b, h;
        System.out.print("Enter length, breadth and height : ");

        l = input.nextFloat();
        b = input.nextFloat();
        h = input.nextFloat();
        float totalArea = 2*(l*b + b*h + h*l);
        float volume = l*b*h;

        System.out.println("Total area of cuboid : " + totalArea);
        System.out.println("Volume of cuboid : " + volume);
    }
}
