package $04_String_Class_And_Printing;

public class _02_Formate_specifier {
    public static void main(String[] args) {
        int x = 10;
        float y = 123.45f, z = 0.000345f;
        String str = "pranav singh";

        // %conversion
        System.out.println("pranav "+y);
        System.out.printf("pranav %f\n",y);
        System.out.printf("pranav %e\n",y);
        System.out.printf("pranav %e\n",z);
        System.out.printf("pranav %g\n",y);
        System.out.printf("pranav %g\n",z);
        System.out.printf("hello %s\n",str);

        // %[argument_index$]conversion
        System.out.println("-----------------------------------------");
        System.out.printf("%1$d %1$d %1$d \n",x);
        System.out.printf("%2$f %1$d %1$d \n",x,y);
        System.out.printf("%f %d %d \n",y,x,x);
        System.out.printf("%f %2$d %2$d \n",y,x);

        // flag and width
        System.out.println("------------------------------------------");
        System.out.printf("%d\n",x);
        System.out.printf("%5d\n",x); //width = 5 , 10 will be printed in using 5 place
        System.out.printf("%05d\n",x); //passed flag 0 with width 5 - 10 will be printed using 5 placed and flag 0 will be printed on empty places
        System.out.printf("%+5d\n",x);
        System.out.printf("%-5d\n",x);
        System.out.printf("%(5d\n",-x);

    }
}
