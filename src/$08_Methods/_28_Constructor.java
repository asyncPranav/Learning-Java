package $08_Methods;

class Rectangle2{
    private int length;
    private int width;

    //non-parameterized constructor
    public Rectangle2(){
        length = 1;
        width = 1;
    }

    //parameterized constructor
    public Rectangle2(int l, int w){
        length = l;
        width = w;
    }

    public Rectangle2(int s){
        length = width = s;
    }

    //area method
    public int area(){
        return length*width;
    }

    //perimeter method
    public int perimeter(){
        return 2*(length+width);
    }

    //isSquare method
    public boolean isSquare(){
        return length==width;
    }
}
public class _28_Constructor {
    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2();
        System.out.println("Area : "+r1.area());
        System.out.println("Perimeter : "+r1.perimeter());
        System.out.println("Is square : "+r1.isSquare());
        System.out.println("");

        Rectangle2 r2 = new Rectangle2(10, 2);
        System.out.println("Area : "+r2.area());
        System.out.println("Perimeter : "+r2.perimeter());
        System.out.println("Is square : "+r2.isSquare());
        System.out.println("");

        Rectangle2 r3 = new Rectangle2(5);
        System.out.println("Area : "+r3.area());
        System.out.println("Perimeter : "+r3.perimeter());
        System.out.println("Is square : "+r3.isSquare());
        System.out.println("");

        //there is a problem, here parameterized constructor does not check if length is +ve or -ve ===> check next program for solution
        Rectangle2 r4 = new Rectangle2(-10, 2);
        System.out.println("Area : "+r4.area());
        System.out.println("Perimeter : "+r4.perimeter());
        System.out.println("Is square : "+r4.isSquare());
    }
}
