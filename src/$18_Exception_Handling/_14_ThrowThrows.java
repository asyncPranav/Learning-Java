package $18_Exception_Handling;

public class _14_ThrowThrows {

    // Method to calculate area - Properly throws an exception instead of handling it here
    public static int area(int l, int b) throws Exception { // Declaring that this method can throw an exception
        if (l < 0 || b < 0) {
            /*
               ❌ WRONG way: Handling exception inside the method is incorrect.
               ✅ CORRECT way: Throw the exception and let the calling method handle it.

               Why should we throw the exception instead of handling it here?
               - The function should NOT continue execution if invalid inputs are provided.
               - If we handle the exception here, the function may still return an incorrect value.
               - Throwing an exception stops execution immediately and informs the caller about the error.
            */
            throw new Exception("Dimensions can't be negative"); // Throwing exception to the caller
        }

        // ✅ If inputs are valid, return the correct area
        int c = l * b;
        return c;
    }

    // Handling Exception here in meth1()
    public static void meth1() {
        try {
            /*
               ✅ Calling the area() method.
               - This method call might throw an exception if negative dimensions are passed.
               - If an exception occurs, it will be caught in the catch block.
            */
            int a = area(-10, 5); // Passing an invalid value intentionally

            // ✅ This line will only execute if no exception occurs.
            System.out.println("Area is " + a);
        }
        catch (Exception e) {
            /*
               ✅ Handling the exception here.
               - Now the exception does NOT crash the program.
               - Instead, we display an appropriate message to inform the user.
            */
            System.out.println("Exception handled in meth1(): " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Start of program");

        /*
           ✅ Calling meth1(), which in turn calls area().
           - If an exception occurs inside area(), meth1() handles it.
           - So, the program does not crash.
        */
        meth1();

        System.out.println("End of program");
    }

    /*
        ✅ Why is this Approach Correct?
            📌 Exception is NOT handled inside area(), but instead thrown to the caller.
            📌 Prevents incorrect execution (no incorrect value is printed when an error occurs).
            📌 More flexible—different callers (methods) can handle the exception in their own way.


        <-------------------📚 Key Takeaways---------------->

        💡 Bad Approach (Previous Method - Incorrect)
                -> Catches the exception inside area(), but execution continues.
                -> Prints an invalid area even if dimensions were incorrect.

        💡 Good Approach (This Method - Correct)
                -> area() throws an exception if dimensions are invalid.
                -> meth1() handles the exception properly.
                -> Prevents the program from printing incorrect results.
     */
}
