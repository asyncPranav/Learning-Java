package $03_Opeartor_And_Expression;

public class _07_Bitwise {
    public static void main(String[] args) {
        int x = 10, y = 6;
        int z = x | y;
        System.out.println(z);

        //we know that integer can be initialised in binary form also
        int a = 0b1010, b = 0b0110;
        int c = a | b;
        System.out.println(c); //---> same as z

        int p = x & y;
        System.out.println(p);

        int q = x ^ y;
        System.out.println(q);

        int r = x << 1;
        System.out.println(r);

        int s = y >> 1;
        System.out.println(s);

        //bitwise not operator
        System.out.println("\n");
        int t = 10;
        int u = ~t;
        System.out.println(Integer.toBinaryString(t));
        System.out.println(Integer.toBinaryString(u));
        System.out.println(u);
        System.out.println(~6);
        System.out.println(~100);

        //unsigned right shift operator
        System.out.println("\n");
        System.out.println(-5);
        System.out.println(-5/2);
        System.out.println(-5>>1);
        System.out.println(-5>>>1);

        System.out.println(" ");
        System.out.println(Integer.toBinaryString(-10));
        System.out.println(Integer.toBinaryString(-10>>1));
        System.out.println(Integer.toBinaryString(-10>>>1));
        System.out.println(-10>>>1);
    }
}
