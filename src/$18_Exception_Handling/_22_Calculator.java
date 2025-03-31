package $18_Exception_Handling;

import java.util.Scanner;

public class _22_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter operator : ");
        String op = sc.next();
        System.out.print("Enter first number : ");
        int b = sc.nextInt();

        int result=0;
        switch (op){
            case "+" -> result = a+b;
            case "-" -> result = a-b;
            case "*" -> result = a*b;
            case "/" -> {
                try {
                    result = a / b;
                }
                catch(Exception e){
                    System.out.println("Division by zero is not possible");
                    return;
                }
            }
            default -> {
                System.out.println("Invalid operator");
                return;
            }
        }
        System.out.println("Result : "+result);

    }
}
