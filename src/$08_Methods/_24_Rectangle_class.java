package $08_Methods;

class Rectangle{
    public float length;
    public float breadth;
    public float area(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        /* method-01
        if(length==breadth) return true;
        return false;
         */

        //method-02
        return length==breadth;
    }
}
public class _24_Rectangle_class {
    public static void main(String[] args) {

        //first object of class Rectangle
        Rectangle r1 = new Rectangle();
        r1.length = 1.2f;
        r1.breadth = 2;
        System.out.println("\nArea : "+r1.area());
        System.out.println("Perimeter : "+r1.perimeter());
        System.out.println("Is square : "+r1.isSquare());

        //second object of class Rectangle
        Rectangle r2 = new Rectangle();
        r2.length = 2.1f;
        r2.breadth = 2.1f;
        System.out.println("\nArea : "+r2.area());
        System.out.println("Perimeter : "+r2.perimeter());
        System.out.println("Is square : "+r2.isSquare());

    }
}
