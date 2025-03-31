package $18_Exception_Handling;

import java.util.Scanner;

class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("Division by zero is not possible");
    }
}

class InvalidOperatorException extends Exception {
    public InvalidOperatorException() {
        super("Invalid operator");
    }
}

public class _23_Calculator {
    public static int calculate(int a, int b, String op) throws DivideByZeroException, InvalidOperatorException {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    throw new DivideByZeroException();
                }
                yield a / b;
            }
            default -> throw new InvalidOperatorException();
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter operator : ");
        String op = sc.next();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        try {
            int result = calculate(a, b, op);
            System.out.println("Result : " + result);
        } catch (DivideByZeroException | InvalidOperatorException e) {
            System.out.println(e.getMessage());
        }
    }
}
