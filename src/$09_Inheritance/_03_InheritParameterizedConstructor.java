package $09_Inheritance;

class Parentt{
    public Parentt(){
        System.out.println("non param of Parent");
    }
    public Parentt(int x){
        System.out.println("param of Parent");
    }
}
class Childd extends Parentt{

    //overloaded constructor
    public Childd(){
        System.out.println("non param of Child");
    }
    public Childd(int x){
        System.out.println("param of Child");
    }
    public Childd(int x,int y){
        super(x);
        System.out.println("param of Child");
    }
}

public class _03_InheritParameterizedConstructor {
    public static void main(String[] args) {
        Parentt p1 = new Parentt();
        System.out.println();

        Parentt p2 = new Parentt(3);
        System.out.println();

        Childd c1 = new Childd();
        System.out.println();

        //Explanation : check obsidian/Java-Doubts/Doubt-14
        Childd c2 = new Childd(3);
        System.out.println();

        Childd c3 = new Childd(3,4);
        System.out.println();


    }
}
