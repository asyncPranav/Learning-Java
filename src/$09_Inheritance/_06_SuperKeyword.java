package $09_Inheritance;

class Parenttt{
    int num;
    Parenttt(){
        System.out.println("hello");
    }
    Parenttt(int num){
        this.num = num;
    }
}
class Childdd extends Parenttt{
    int lol;
    Childdd(int num, int lol){
        super(num); //if we comment this line then output --> hello , num : 0 , lol : 4
        this.lol = lol;
    }
    void display(){
        System.out.println("num : "+num);
        System.out.println("lol : "+lol);
    }
}
public class _06_SuperKeyword {
    public static void main(String[] args) {
        Childdd c = new Childdd(5,4);
        c.display();
    }
}
