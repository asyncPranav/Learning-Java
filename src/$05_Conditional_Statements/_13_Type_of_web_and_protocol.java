package $05_Conditional_Statements;
import java.util.Scanner;

public class _13_Type_of_web_and_protocol {
    public static void main(String[] args) {

        // find type of website and protocol used
        // http://www.google.com
        // com-commercial, org-organisation, gov-government, net-network
        // protocol - http, https, ftp

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a website : ");
        String url = input.next();
        input.close();

        int index_of_colon = url.indexOf(':');
        String protocol = url.substring(0, index_of_colon);
        //-->method-02
        //String protocol = url.substring(0, url.indexOf(':'));

        int index_of_period = url.lastIndexOf('.');
        String web_type = url.substring(index_of_period + 1);
        //-->method-02
        //String web_type = url.substring(url.lastIndexOf('.') + 1);

        //output type of website
        if (web_type.equals("com")) {
            System.out.println("Website type : commercial");
        } 
        else if (web_type.equals("org")) {
            System.out.println("Website type : organisation");
        } 
        else if (web_type.equals("gov")) {
            System.out.println("Website type : government");
        } 
        else if (web_type.equals("net")) {
            System.out.println("Website type : network");
        }

        //output protocol
        if (protocol.equals("http")) {
            System.out.println("Protocol : hyper text transfer protocol");
        } 
        else if (protocol.equals("https")) {
            System.out.println("Protocol : secured hyper text transfer protocol");
        } 
        else if (protocol.equals("ftp")) {
            System.out.println("Protocol : file transfer protocol");
        }

    }
}
