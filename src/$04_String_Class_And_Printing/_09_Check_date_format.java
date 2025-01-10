package $04_String_Class_And_Printing;
import java.util.Scanner;

public class _09_Check_date_format {
    public static void main(String[] args) {

        //check if date is in dd/mm/yyyy format
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date in dd/mm/yyyy format : ");
        String str = input.next();
        // Regex : "[0-3][0-9]/[01][0-9]/[0-9]{4} --> it violate such as date=39, month=19 etc
        boolean isCorrect = str.matches("^(0[1-9]|[12][0-9]3[01])/(0[1-9]|1[0-2])/\\d{4}$");
        System.out.println("Is date format correct : "+isCorrect);
    }
}
