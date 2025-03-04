package $09_Inheritance;

class Rectangle{
    //properties
    int length;
    int breadth;

    //constructor
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    //methods
    public void display(){
        System.out.println("Length : "+length);
        System.out.println("Breadth : "+breadth);
    }
}
public class _05_ThisKeyword {
    public static void main(String[] args) {
        Rectangle r =  new Rectangle(5,10);
        r.display();
    }
}
