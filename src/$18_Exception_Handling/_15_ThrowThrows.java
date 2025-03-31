package $18_Exception_Handling;

public class _15_ThrowThrows {

    // ✅ This method calculate area of rectangle and checks if the given dimensions are negative.
    // ❌ If negative, it THROWS an exception instead of handling it.
    //    It does NOT use try-catch, meaning the caller must handle it.
    public static void area(int l, int b) throws Exception {
        if (l < 0 || b < 0) {
            // ❌ Instead of handling the exception, we THROW it.
            //    The calling method (meth1) will now be responsible for handling it.
            throw new Exception("Dimensions can't be negative");
        }
    }

    // ✅ This method calls `area()` but does NOT handle the exception either.
    // ❌ Instead, it DECLARES "throws Exception" to pass it to `main()`.
    public static void meth1() throws Exception {
        // Calling area() with invalid dimensions, which will throw an exception.
        area(-10, 5);

        // 🚨 This line will never execute if an exception is thrown above.
        System.out.println("Area calculated successfully!");
    }

    // ✅ The main() method calls meth1(), but again, it does NOT handle the exception.
    // ❌ Instead, it declares "throws Exception", passing the exception to the JVM.
    public static void main(String[] args) throws Exception {
        System.out.println("Start of the program");

        // ❌ Calling meth1(), which may throw an exception.
        //    Since main() also does NOT handle it, it gets passed to the JVM.
        meth1();

        // 🚨 This line will NEVER execute if an exception is thrown above.
        System.out.println("End of the program");
    }


    /*
        🚨 Method Calling & Exception Propagation Flow
            1️⃣ main() → calls meth1()
            2️⃣ meth1() → calls area(-10, 5)
            3️⃣ area() → checks for negative values
            4️⃣ area() → ❌ Throws Exception ("Dimensions can't be negative")
            5️⃣ Exception → propagates to meth1() (not handled)
            6️⃣ Exception → propagates to main() (not handled)
            7️⃣ Exception → passes to JVM → ❌ Program crashes


        📌 Why No Compilation Error Occurs even if Exception is checked exception
            -> The program compiles successfully because every method that can throw an exception declares throws Exception in its signature.
            -> Checked exceptions (like Exception) must be either handled using try-catch or declared using throws.
            -> Here, the exception is declared but not handled, so the program compiles but crashes at runtime when the exception is thrown.

     */
}
