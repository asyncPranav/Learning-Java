package $18_Exception_Handling;

public class _13_ThrowThrows {

    // Method to calculate area, demonstrates a wrong way of handling exceptions
    public static int area(int l, int b) {
        if (l < 0 || b < 0) {
            // Below line would normally cause a compilation error if not handled:
            // java: unreported exception java.lang.Exception; must be caught or declared to be thrown
            // throw new Exception("Dimensions can't be negative"); // Compilation error: Unreported exception

            //---> Either handle the exception here or throw it to the calling method

            // 1. Handling the exception inside the method (Incorrect Approach)
            /*
               Why is this approach incorrect?
               - The exception is caught inside the method itself, so it never propagates.
               - The function **continues execution** after handling the exception.
               - Even though an exception occurred, it still returns a result.
               - The returned value might be incorrect or misleading.
               - This is an example of BAD exception handling because the function does not behave correctly when an error occurs.
            */
            try {
                throw new Exception("Dimensions can't be negative"); // Manually throwing an exception
            }
            catch (Exception e) {
                System.out.println("Exception is caused by -> " + e);
            }
        }

        // Even though an exception was caught and printed, the function STILL RETURNS a value!
        return l * b; // Incorrect behavior: function should ideally stop instead of returning a value.
    }

    public static void meth1() {
        int a = area(-10, 5); // Calling area() with invalid values
        System.out.println("Area is " + a); // This prints a value even after an exception!
    }

    public static void main(String[] args) {
        System.out.println("Start of program");
        meth1(); // Calls meth1(), which in turn calls area()
        System.out.println("End of program");
    }

    /*
        ✅ Why Handling Inside area() Was Useless?
            -> The area() function should stop execution if dimensions are invalid.
            -> But in your code, even after printing the exception, the function still returns a value, which is wrong.
            -> Instead, it’s better to throw the exception to the calling method, so it decides what to do.
     */
}
