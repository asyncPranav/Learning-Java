package $12_Interface;

interface Test{
    void meth1();
    void meth2();
    private void meth4(){
        System.out.println("private method of interface");
    }
    default void meth5(){
        meth4();
    }
}
class MyTest implements Test{
    public void meth1(){
        System.out.println("Method-01 of class MyTest");
    }
    public void meth2(){
        System.out.println("Method-02 of class MyTest");
    }
    public void meth3(){
        System.out.println("Method-03 of class MyTest");
    }
}
public class _01_Interface {
    public static void main(String[] args) {
        Test t1 = new MyTest();
        t1.meth1();
        t1.meth2();
        //t1.meth3(); ---> can't access
        System.out.println();

        MyTest t2 = new MyTest();
        t2.meth1();
        t2.meth2();
        t2.meth3();
        t2.meth5();
    }
}
