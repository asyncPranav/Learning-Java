package $18_Exception_Handling;

public class _11_ExceptionPassing {
    public static int meth1(){
        return 10/2;
    }
    public static void meth2(){
        int r = meth1();
        System.out.println("Result of division is "+r);
    }
    public static void meth3(){
        meth2();
    }
    public static void main(String[] args) {
        System.out.println("hello");
        meth3();
    }

    // Execution Order: main() -> meth3() -> meth2() -> meth1()
    // Method Calls: main() -> meth3() -> meth2() -> meth1()
    // Method Returns: meth1() -> meth2() -> meth3() -> main()

    // If we change 10/2 to 10/0, it will throw an ArithmeticException at runtime.
    // Since there is no try-catch block, the exception will propagate up the call stack (calling methods):
    // meth1() -> meth2() -> meth3() -> main(), ultimately causing the program to terminate.
    //exception raises to calling methods, it should be handled somewhere if not handled then it will pass on to JVM and JVM will crash the program or terminate the program abnormally
    //in next program we will see how to handle it
}
