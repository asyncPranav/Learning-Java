package $18_Exception_Handling;
import java.io.*;

public class _08_CheckedException {
    public static void meth1() {
        // Checked Exception -> FileNotFoundException
        // The compiler checks it and forces you to handle it; otherwise, the program will not compile.

        // The following line will cause a compilation error unless handled:
        // FileInputStream fi = new FileInputStream("My.txt");

        // Solution: Handle with try-catch or declare throws
        try {
            FileInputStream fi = new FileInputStream("My.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }
    public static void meth2() {
        meth1();
    }
    public static void main(String[] args) {
        meth2();
    }
}

