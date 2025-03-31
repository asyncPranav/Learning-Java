/*
    In previous example, meth1() catches the exception and prints it, but what if we want meth2() to handle it instead?
 */
package $18_Exception_Handling;

class MinimumBalanceExceptionn extends Exception {
    public String toString() {
        return "Minimum balance can't be less than 1000, Decrease withdrawal amount";
    }
}

public class _10_UserdefinedException {
    public static void meth1() throws MinimumBalanceExceptionn { // Declare exception
        throw new MinimumBalanceExceptionn(); // Throw exception
    }

    public static void meth2() {
        try {
            meth1(); // Call meth1(), which throws the exception
        } catch (MinimumBalanceExceptionn e) {
            System.out.println("Exception handled in meth2(): " + e);
        }
    }

    public static void main(String[] args) {
        meth2(); // Call meth2() which now handles the exception
    }
}
/*
    🔥 Benefits of This Change:
    ✅ More Flexibility: meth1() only declares an exception, leaving it to the caller to handle.
    ✅ Better Exception Propagation: meth2() now decides how to handle the exception.
    ✅ More Realistic Scenario: In real-world applications, we often propagate exceptions up the call stack for centralized handling.

    Your previous code was correct, but if you want better exception handling and code structure, consider propagating the exception instead of catching it in meth1().
 */

