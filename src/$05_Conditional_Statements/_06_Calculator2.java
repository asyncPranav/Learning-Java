package $05_Conditional_Statements;
import java.util.Scanner;

public class _06_Calculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float num1 = input.nextFloat();
        System.out.print("Enter operator : ");
        char op = input.next().charAt(0);
        System.out.print("Enter second number : ");
        float num2 = input.nextFloat();
        input.close();
        float result = switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> throw new IllegalStateException("Unexpected value: " + op);
        };
        System.out.println("Result : " + result);
    }
}
