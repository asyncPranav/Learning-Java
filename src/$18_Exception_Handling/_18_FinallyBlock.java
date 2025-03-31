package $18_Exception_Handling;

public class _18_FinallyBlock {
    public static void meth1() throws Exception{
        /*
        throw new Exception();

        //------> I want to print this final statement even if method is throwing an exception, but this statement is unreachable because throwing exception means method will terminate in that line and control will pass to the calling method
        System.out.println("Finally statement");
         */

        // You can make it executable using Finally block
        try{
            throw new Exception();
        }
        finally {
            System.out.println("Finally statement");
        }
    }
    public static void main(String[] args) throws Exception{
        meth1();
    }
}

/* ----> Output should be : Read Doubt-31 Java

    Finally statement
    Exception in thread "main" java.lang.Exception
        at $18_Exception_Handling._18_FinallyBlock.meth1(_18_FinallyBlock.java:14)
        at $18_Exception_Handling._18_FinallyBlock.main(_18_FinallyBlock.java:21)


    //----> Explanation :
        - try block inside meth1() throws an Exception.
        - Before the method terminates, the finally block executes first, printing "Finally statement".
        - Since the exception is not caught, it propagates to the calling method (main()), leading to a runtime crash after printing the "Finally statement".

        ✔ Order of Execution:
        - finally block executes before the exception propagates to main().
        - Since main() also does not handle the exception, the program crashes after finally executes.
 */