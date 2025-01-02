package $01_Introduction;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your roll no : ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is " + rollno);

        input.nextLine(); //to consume new line character

        System.out.print("enter your name : ");
        String name = input.nextLine();
        System.out.println("your name is " + name);

        System.out.print("enter your percentage : ");
        float percentage = input.nextFloat();
        System.out.println("your percentage is " + percentage + "%");

        System.out.print("enter a large decimal number : ");
        double largeDecimal = input.nextDouble();
        System.out.println("your large decimal number is " + largeDecimal);
    }
}