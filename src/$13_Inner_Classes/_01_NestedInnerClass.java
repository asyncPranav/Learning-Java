package $13_Inner_Classes;

class Outer{
    String outerName = "pranav singh";
    class Inner{
        String innerName = "atul singh";
        void display(){
            System.out.println("\n---- Showing by Inner class ----");
            System.out.println("Outer name : "+outerName);
            System.out.println("inner name : "+innerName);
        }
    }
    void display(){
        System.out.println("\n---- Showing by Outer class ----");
        System.out.println("Outer name : "+outerName);

        Inner i = new Inner();
        System.out.println("Inner name : "+i.innerName);
    }
}
public class _01_NestedInnerClass {
    public static void main(String[] args) {

        //object of Outer class
        Outer o = new Outer();
        o.display();

        //object of Inner class
        Outer.Inner i = new Outer().new Inner();
        i.display();
    }
}
