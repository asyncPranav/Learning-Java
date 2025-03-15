package $13_Inner_Classes;

class OuterClass{
    static int x = 10;
    int y = 20;
    static class InnerClass{
        void innerDisplay(){
            System.out.println("\n---- From Inner Class ----");
            System.out.println("Value of x : "+x);
            //System.out.println("Value of y : "+y); --> non-static members cant be accessed
            System.out.println("Valur of y can't be accessed");
        }
    }
    void outerDisplay(){
        System.out.println("\n---- From Outer Class ----");
        System.out.println("Value of x : "+x);
        System.out.println("Value of y : "+y);
    }
}
public class _04_StaticInnerClass {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        o.outerDisplay();
        //new OuterClass().outerDisplay();


        OuterClass.InnerClass i = new OuterClass.InnerClass();
        i.innerDisplay();
        //new OuterClass.InnerClass().innerDisplay();


    }
}
