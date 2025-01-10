package $04_String_Class_And_Printing;
import java.util.Scanner;

public class _08_Check_hexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no to check it is hexadecimal or not : ");
        String str = input.next();
        boolean isHex = str.matches("[0-9a-fA-F]+");
        System.out.println("Number is hexadecimal : "+isHex);
    }
}
