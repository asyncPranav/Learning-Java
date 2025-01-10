package $04_String_Class_And_Printing;
import java.util.Scanner;

public class _11_Remove_extra_space {
    public static void main(String[] args) {

        //remove extra space from string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string with extra spaces : ");
        String str = input.nextLine();
        input.close();

        String formated_str = str.replaceAll("\\s+", " ");
        System.out.println("Original string :"+str);
        System.out.println("Formated string :"+formated_str);

        //if string have leading or tailing space then also that will be replaced with one space but we do not want ant leading and tailing space in string then use trim() method
        formated_str =  formated_str.trim();
        System.out.println("Formated string :"+formated_str);

        //one line code {you can multiple method simultaneously}
        System.out.println("Formated  string :"+str.replaceAll("\\s+", " ").trim());
    }
}
