package $08_Methods;

class Rectangle3{
    private int length;
    private int width;

    //parameterized constructor -> method-01 ===> which accept valid length and width
    public Rectangle3(int l, int w){
        //verify length
        if(l>=0){
            length = l;
        }else {
            System.out.println("length cant be -ve, get set to zero");
            length = 0;
        }
        //verify width
        if(w>=0){
            width=w;
        }else{
            System.out.println("width cant be -ve, get set to zero");
            width = 0;
        }
    }

    //getter for length
    public int getLength() {
        return length;
    }

    //getter for width
    public int getWidth() {
        return width;
    }

    //setter for length
    public void setLength(int l){
        if(l>=0){
            length = l;
        }else {
            System.out.println("length cant be -ve, get set to zero");
            length = 0;
        }
    }

    //setter for width
    public void setWidth(int w) {
        if(w>=0){
            width=w;
        }else{
            System.out.println("width cant be -ve, get set to zero");
            width = 0;
        }
    }

    //parameterized constructor -> method-02
    /*
    public Rectangle3(int l, int w){
        setLength(l);
        setWidth(w);
    }
     */



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
public class _29_Constructor2 {
    public static void main(String[] args) {
        Rectangle3 r1 = new Rectangle3(10,5);
        System.out.println("------------------> RECTANGLE 01");
        System.out.println("Length : "+r1.getLength());
        System.out.println("Width : "+r1.getWidth());
        System.out.println("Area : "+r1.area());
        System.out.println("Perimeter : "+r1.perimeter());
        System.out.println("Is square : "+r1.isSquare());
        System.out.println("");

        Rectangle3 r2 = new Rectangle3(-10,5);
        System.out.println("-------------------> RECTANGLE 02");
        System.out.println("Length : "+r2.getLength());
        System.out.println("Width : "+r2.getWidth());
        System.out.println("Area : "+r2.area());
        System.out.println("Perimeter : "+r2.perimeter());
        System.out.println("Is square : "+r2.isSquare());
        System.out.println("");




    }
}
