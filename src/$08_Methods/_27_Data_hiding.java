package $08_Methods;

class Rectangle1{
    private int length;
    private int width;
    public int getLength(){
        return length;
    }
    public void setLength(int l){
        if(l>=0){
            length = l;
        }else{
            System.out.println("WARNING : Length cant be negative");
        }
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int w){
        if(w>=0){
            width = w;
        }else{
            System.out.println("WARNING : Width cant be negative");
        }
    }
    public int area(){
        //method-01
        //return length*width;
        //method-02
        return getLength()*getWidth();
    }
    public int perimeter(){
        //method-01
        //return 2*(length+width);
        //method-02
        return 2*(getLength()*getWidth());
    }
}
public class _27_Data_hiding {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();

        //initial length and width
        System.out.println("Length : "+r.getLength());
        System.out.println("Width : "+r.getWidth());

        //without setting length and width
        System.out.println("Area : "+r.area());
        System.out.println("Perimeter : "+r.perimeter());

        //set length and width
        r.setLength(10);
        r.setWidth(5);

        //after setting length and width
        System.out.println("Area : "+r.area());
        System.out.println("Perimeter : "+r.perimeter());

        //access length and width
        System.out.println("Length : "+r.getLength());
        System.out.println("Width : "+r.getWidth());

        //set negative value to length and width
        r.setLength(-10);
        r.setWidth(-5);
    }
}
