package $04_String_Class_And_Printing;

public class _03_String_practice {
    public static void main(String[] args) {
        String str1 = "Java Program";
        System.out.println(str1);

        String str2 = new String("Java");
        System.out.println(str2);

        //char c[] = {'J', 'a', 'v', 'a', 'p'};
        char[] c = {'J', 'a', 'v', 'a', 'p'};
        String str3 = new String(c);
        System.out.println(str3);

        //byte b[] = {65, 66, 67, 68, 69};
        byte[] b = {65, 66, 67, 68, 69};
        String str4 = new String(b);
        System.out.println(str4);

        //more constructor in String class
        System.out.println("------------------------------------->");
        String str5 = new String(b, 2, 2);
        System.out.println(str5);

        String str6 = new String(c, 0, 4);
        System.out.println(str6);

        //exploring string pool
        System.out.println("------------------------------------>");

        String str7 = "Pranav";
        String str8 = "Pranav";
        //System.out.println(str7.equals(str8));
        System.out.println(str7==str8);

        String str9 = "pranav";
        System.out.println(str7==str9);

        String str10 = new String("Pranav");
        System.out.println(str7==str10);



    }
}
