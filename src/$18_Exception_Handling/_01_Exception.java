package $18_Exception_Handling;

public class _01_Exception {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;
        int c = a/b;
        System.out.println(c); //---> ArithmeticException: / by zero
        System.out.println("End of the program");
        System.out.println("Bye Bye...");
    }
}
