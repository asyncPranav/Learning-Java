package $04_String_Class_And_Printing;
import java.util.Scanner;

public class _10_Remove_special_char {
    public static void main(String[] args) {

        //remove special character from string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string with special character in between : ");
        String str = input.nextLine();
        input.close();

        String formated_str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Original string : "+str);
        System.out.println("Formated string : "+formated_str);
    }
}
