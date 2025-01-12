package $05_Conditional_Statements;
import java.util.Scanner;

public class _15_Website_type {
    public static void main(String[] args) {

        //take website from user as google.com, telegram.org etc
        //and print type of website it is
        Scanner input = new Scanner(System.in);
        System.out.print("Enter website : ");
        String url = input.next();
        input.close();

        String domain = url.substring(url.indexOf('.')+1);
        switch(domain){
            case "com" :
                System.out.println("Type : commercial");
                break;
            case "org" :
                System.out.println("Type : organisation");
                break;
            case "net" :
                System.out.println("Type : network");
                break;
            case "gov" :
                System.out.println("Type : government");
                break;
            default :
                System.out.println("Type is not in my data !!");
        }

    }
}
