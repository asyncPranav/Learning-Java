package $04_String_Class_And_Printing;
import java.util.Scanner;

public class _17_Reverse_str {
    public static void main(String[] args) {

        //Reverse string taken from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string for reversing : ");
        String str = input.nextLine();
        input.close();

        String revStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            revStr = ch + revStr;
        }

        System.out.println("Original str : "+str);
        System.out.println("Reversed str : "+revStr);





    }
}
