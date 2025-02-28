package $09_Inheritance;

class Circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height; //able to use area() because due to inheritance it is also present in Cylinder class
    }
}
public class _01_Inheritance {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius=7;
        c.height=10;
        System.out.println("Volume of cylinder : "+c.volume()); //volume method of Cylinder is called
        System.out.println("Area of circle :"+c.area()); //area method of Circle is called
    }
}
