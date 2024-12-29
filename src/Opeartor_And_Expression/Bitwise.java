package Opeartor_And_Expression;

public class Bitwise {
    public static void main(String[] args) {
        int x = 10, y = 6;
        int z = x | y;
        System.out.println(z);

        int p = x & y;
        System.out.println(p);

        int q = x ^ y;
        System.out.println(q);

        int r = x << 1;
        System.out.println(r);

        int s = y >> 1;
        System.out.println(s);

        //we know that integer can be initialised in binary form also
        int a = 0b1010, b = 0b0110;
        int c = a | b;
        System.out.println(c); //---> same as z

    }
}
