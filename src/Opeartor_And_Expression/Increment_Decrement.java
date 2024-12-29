package Opeartor_And_Expression;

public class Increment_Decrement {
    public static void main(String[] args) {
        int x = 5;
        x++;
        System.out.println(x);

        float y = 5.3f;
        y--;
        System.out.println(y);

        char z = 'a';
        z++;
        System.out.println(z);

        int p = 5;
        int q = p--;
        System.out.println(p + " " + q);

        char a = 'A';
        char b = ++a;
        char c = a++;
        System.out.println(a + " " + b + " " + c);
    }
}
