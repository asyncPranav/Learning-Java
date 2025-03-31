package $18_Exception_Handling;

import java.util.Scanner;

public class _21_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a = sc.nextFloat();
        System.out.print("Enter operator : ");
        String op = sc.next();
        System.out.print("Enter first number : ");
        float b = sc.nextFloat();

        float result=0f;
        switch (op){
            case "+" -> result = a+b;
            case "-" -> result = a-b;
            case "*" -> result = a*b;
            case "/" -> result = a / b;
            default -> {
                System.out.println("Invalid operator");
                return;
            }
        }
        System.out.println("Result : "+result);
    }
}
/*
    We did not get any exception here in division by zero, this is how float and double work in java
    -> read Doubt 31 Java for detailed explanation
    -> check next program for getting exception
 */