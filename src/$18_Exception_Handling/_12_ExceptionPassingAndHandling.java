package $18_Exception_Handling;

public class _12_ExceptionPassingAndHandling {
    public static int meth1(){
        return 10 / 0; // This will cause an ArithmeticException
    }

    public static void meth2(){
        int r = meth1(); // Exception propagates from meth1() to meth2()
        System.out.println("Result of division is " + r); // Will not execute because exception occurred in above line
    }

    public static void meth3(){
        meth2(); // Exception propagates from meth2() to meth3()
    }

    public static void main(String[] args) {
        System.out.println("Start of the program");
        try {
            meth3(); // Exception propagates from meth3() to main()
        }
        catch (Exception e) {
            // The exception is caught here, preventing abnormal program termination
            System.out.println("Exception caught: " + e);
        }
        System.out.println("End of the program");
    }

    //We can also handle this exception in meth1(), meth2(), or meth3().
    //The behavior of exception propagation will change depending on where we handle it.

    //If we handle the exception in meth1():
    //   -> The exception will be caught inside meth1() itself.
    //   -> It will not propagate further to meth2(), meth3(), or main().
    //   -> The program will continue normally from meth1() onwards.

    //If we handle the exception in meth2():
    //   -> The exception will propagate from meth1() to meth2().
    //   -> It will be caught inside meth2(), preventing further propagation.
    //   -> meth3() and main() will continue execution as if no exception occurred.

    //If we handle the exception in meth3():
    //   -> The exception will propagate from meth1() → meth2() → meth3().
    //   -> It will be caught inside meth3(), stopping further propagation.
    //   -> main() will execute normally after meth3() finishes execution.

    //If we handle the exception in main():
    //   -> The exception will propagate through all methods (meth1() → meth2() → meth3() → main()).
    //   -> It will be caught in the main() method, preventing program termination.
    //   -> The program will continue executing normally after handling the exception.

}
