/*
    Problem Statement: Stack Implementation with Exception Handling ( LIFO )
    Implement a Stack data structure in Java with the following functionalities:

        Push Operation: Adds an element to the stack. If the stack is full, throw a custom StackOverflowException.
        Pop Operation: Removes the top element. If the stack is empty, throw a custom StackUnderflowException.
        Print Stack: Displays the current stack elements.
        Exit: Terminates the program.

    The program should first take the stack size as input and then allow the user to choose operations from a menu. Handle exceptions gracefully without crashing the program.
 */

package $18_Exception_Handling;

import java.util.Arrays;
import java.util.Scanner;

class StackUnderflowException extends Exception {
    public String toString() {
        return " -->Stack is empty, nothing can be popped";
    }

}

class StackOverflowException extends Exception {
    public String toString() {
        return "-->Stack is full, nothing can be pushed";
    }
}

class Stack {
    private int size;
    private int[] stack;
    private int top = -1;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    public int[] getStack() {
        return stack;
    }

    public void push(int value) throws StackOverflowException {
        if (top == stack.length - 1) {
            throw new StackOverflowException();
        }
        stack[++top] = value;
    }

    public int pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException();
        }
        int x = stack[top];
        stack[top] = 0;
        top--;
        return x;
    }
}

public class _20_StudentChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the stack (+ve int) : ");
        int size = sc.nextInt();
        Stack obj = new Stack(size);
        while (true) {
            System.out.println("\n-----Stack Challenge Menu-----");
            System.out.println("1. print stack");
            System.out.println("2. push");
            System.out.println("3. pop");
            System.out.println("4. exit");
            System.out.print("Choose an option from above : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Stack : " + Arrays.toString(obj.getStack()));
                }
                case 2 -> {
                    System.out.print("Enter a value : ");
                    int value = sc.nextInt();
                    try {
                        obj.push(value);
                    }
                    catch (StackOverflowException e){
                        System.out.println(e);
                    }
                }
                case 3 -> {
                    try {
                        System.out.println(" -->Popped : "+obj.pop());
                    }
                    catch (StackUnderflowException e){
                        System.out.println(e);
                    }
                }
                case 4 -> {
                    System.out.println("Exiting.....\n");
                    return;
                }
            }
        }
    }
}
