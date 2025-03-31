package $18_Exception_Handling;

// Custom Exception: MinimumBalanceException
// Since it extends Exception, it is a CHECKED exception (must be handled)
class MinimumBalanceException extends Exception {
    // Overriding toString() to provide a custom error message
    public String toString() {
        return "Minimum balance can't be less than 1000, Decrease withdrawal amount";
    }
}

public class _09_UserdefinedException {

    public static void meth1() {
        /*
            Here we are manually creating and throwing an exception -> MinimumBalanceException.
            Since MinimumBalanceException extends Exception, it becomes a CHECKED exception.
            The compiler FORCES us to handle it; otherwise, the program won't compile.
        */

        try {
            throw new MinimumBalanceException(); // Manually throwing the exception
        }
        catch (MinimumBalanceException e) { // Catching the custom exception
            System.out.println("Exception caught: " + e);
        }
    }

    public static void meth2() {
        // Calling meth1(), which throws and handles the exception inside itself
        meth1();
    }

    public static void main(String[] args) {
        // Calling meth2(), which in turn calls meth1()
        meth2();
    }
}
