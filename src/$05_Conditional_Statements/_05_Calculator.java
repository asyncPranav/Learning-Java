package $05_Conditional_Statements;

import java.util.Scanner;

public class _05_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float num1 = input.nextFloat();
        System.out.print("Enter operator : ");
        char op = input.next().charAt(0);
        System.out.print("Enter second number : ");
        float num2 = input.nextFloat();
        float result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = (float) num1 / num2;
                break;
            default:
                System.out.println("ERROR : Invalid operator....!!");
        }
        System.out.println("Result : " + result);
        input.close();
    }
}