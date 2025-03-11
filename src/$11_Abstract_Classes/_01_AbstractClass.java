package $11_Abstract_Classes;

abstract class Super{
    public Super(){
        System.out.println("Super constructor");
    }
    public void meth1(){
        System.out.println("Super method-01");
    }
    abstract public void meth2();

}
class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Sub method-02 overriding abstract method meth2");
    }
    public void meth3(){
        System.out.println("Sub method-03");
    }
}
public class _01_AbstractClass {
    public static void main(String[] args) {
        //Super s1 = new Super();  --> object can't be created of abstract class
        Super s1 = new Sub();
        s1.meth1();
        s1.meth2();
        //s1.meth3(); --> cant access via super class reference
        System.out.println();

        //reference and object are of the same class here
        Sub s2 = new Sub();
        s2.meth1();
        s2.meth2();
        s2.meth3(); //---> now we can access because now reference of sub class
    }
}
