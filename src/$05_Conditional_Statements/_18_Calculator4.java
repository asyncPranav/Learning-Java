package $05_Conditional_Statements;
import java.util.Scanner;

public class _18_Calculator4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        Object num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Enter second number: ");
        Object num2 = scanner.nextDouble();

        Object result = switch (operator) {
            case "+" -> (num1 instanceof Double d1 && num2 instanceof Double d2) ? d1 + d2 : "Invalid numbers!";
            case "-" -> (num1 instanceof Double d1 && num2 instanceof Double d2) ? d1 - d2 : "Invalid numbers!";
            case "*" -> (num1 instanceof Double d1 && num2 instanceof Double d2) ? d1 * d2 : "Invalid numbers!";
            case "/" -> (num1 instanceof Double d1 && num2 instanceof Double d2) ? (d2 != 0 ? d1 / d2 : "Cannot divide by zero!") : "Invalid numbers!";
            default -> "Invalid operator!";
        };

        System.out.println("Result: " + result);
        scanner.close();
    }
}
