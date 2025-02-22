package $05_Conditional_Statements;
import java.util.Scanner;

public class _17_Calculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> (num2 != 0) ? num1 / num2 : Double.NaN;
            default -> {
                System.out.println("Invalid operator!");
                yield Double.NaN;
            }
        };

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Calculation could not be performed.");
        }

        scanner.close();
    }
}
