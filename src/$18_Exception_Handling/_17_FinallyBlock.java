package $18_Exception_Handling;

public class _17_FinallyBlock {
    public static void main(String[] args) {
        /* ----> In this case, "Finally statement" will never execute.
                  - The first line prints 10/5 normally.
                  - But if changed to 10/0, an ArithmeticException occurs, and the second line is never reached.
         System.out.println(10/5);
         System.out.println("Finally statement");

         */

        /* ----> Using `finally` ensures the execution of the statement even if an exception occurs.
                  - Here, the exception is NOT caught, so the program crashes after executing `finally`.
        */
        try {
            System.out.println(10 / 0); // ArithmeticException occurs
        } finally {
            System.out.println("Finally statement"); // Will execute before program crash
        }

        /* ----> If we catch the exception, the program will not crash.
                  - Execution flow: Try block → Exception occurs → Catch block handles it → Finally executes.
        */
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        } finally {
            System.out.println("Finally statement"); // Always executes
        }

        /* -----> Even without `finally`, we can place cleanup statements after `catch`.
                  - If an exception is handled properly, there is no need for `finally` unless resource management is needed.
                  - If we are handling exception then we can close resources or release the resource, if we aren't handling exception then we need finally block
        */
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        }
        System.out.println("Finally statement (without finally block)"); // Executes if exception is handled
    }

    /*
    ✅ When to Use finally?
        -> Use finally when cleanup is necessary, even if an exception occurs.
        -> If the exception is handled inside catch, finally is optional.
        -> If resources must be released (e.g., closing files, databases), use finally to guarantee cleanup.
     */
}
