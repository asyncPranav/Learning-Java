package $04_String_Class_And_Printing;
import java.util.Scanner;

public class _06_Find_username_and_domain_from_email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your email address : ");
        String email = input.next();

        //find username and domain
        int iOfAt = email.indexOf('@');
        System.out.println("Username : " + email.substring(0, iOfAt));
        System.out.println("Domain : " + email.substring(iOfAt + 1));

        //check if email id is on gmail or not (method-01)
        int iOfPeriod = email.indexOf('.', iOfAt);
        String getDomainName = email.substring(iOfAt + 1, iOfPeriod);
        System.out.println("Email ID is on gmail (method-01) : " + getDomainName.equals("gmail"));

        //check if email id is on gmail or not (method-02)
        String getDomain = email.substring(iOfAt+1);
        System.out.println("Email ID is on gmail (method-02) : " + getDomain.startsWith("gmail"));

    }
}
