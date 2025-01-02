package $04_String_Class_And_Printing;

public class _01_Printing {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("string " + x);
        System.out.println(x + " string");
        System.out.println(x + y + " string");
        System.out.println("string " + x + y);

        //print string 30
        System.out.println("string " + (x+y));

        //print : sum of 10 and 20 is 30
        System.out.println("sum of " + x + " and " + y + " is " + (x+y));

    }
}
