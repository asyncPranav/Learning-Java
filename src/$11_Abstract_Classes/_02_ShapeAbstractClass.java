package $11_Abstract_Classes;

import java.util.Scanner;

abstract class Shape{
    // A generic shape does not have fixed dimensions, so we define only operations, not properties.

    // Every shape must have a way to calculate its perimeter and area,
    // but the exact implementation depends on the specific shape.
    abstract public double perimeter();
    abstract public double area();
}
class Rectangle extends Shape{
    //properties
    double length;
    double breadth;

    //constructor
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    // Implementing the abstract methods specific to a rectangle.
    @Override
    public double perimeter(){
        return 2*(length+breadth);
    }
    @Override
    public double area(){
        return length*breadth;
    }
}
class Circle extends Shape{
    //properties
    double radius;

    //constructor
    Circle(double radius){
        this.radius = radius;
    }

    // Implementing the abstract methods specific to a circle
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
public class _02_ShapeAbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input dimensions of Rectangle
        System.out.print("Enter length and breadth of rectangle : ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        //create object of Rectangle
        Rectangle r = new Rectangle(length, breadth);

        //calling method and printing value
        System.out.println("Perimeter of Rectangle : "+r.perimeter());
        System.out.println("Area of Rectangle : "+r.area());

        //input radius of Circle
        System.out.print("\nEnter radius of circle : ");
        double radius = sc.nextDouble();

        //create object of Circle
        Circle c = new Circle(radius);

        //calling methods and printing values
        System.out.println("Perimeter of circle : "+c.perimeter());
        System.out.println("Area of circle : "+c.area());

        sc.close();
    }
}
