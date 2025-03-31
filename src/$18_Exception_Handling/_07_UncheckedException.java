package $18_Exception_Handling;

public class _07_UncheckedException {

    public static void main(String[] args) {
        System.out.println("Start of the program");

        // Unchecked Exception Example: ArithmeticException
        // If we do not handle this, it will NOT cause a compilation error.
        // The program will compile successfully, but it will crash at runtime.

        // This line will cause ArithmeticException at runtime and println statement will never execute if not handled.
        // int result = 10 / 0;
        // System.out.println("Result: " + result);

        // Handling the exception using try-catch
        try {
            int result = 10 / 0;  // Unchecked exception occurs here
            System.out.println("Result: " + result); // This won't execute if an exception occurs
        }
        catch (ArithmeticException e) {
            // Exception is caught here, preventing program crash
            System.out.println("Exception caught: " + e);
        }

        System.out.println("End of the program");
    }
}

