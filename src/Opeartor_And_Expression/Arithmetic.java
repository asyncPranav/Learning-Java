package Opeartor_And_Expression;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 5, b = 2;
        System.out.println(a/b);
        System.out.println(a%b);

        //typecasting of int to float
        float c = (float)a/b;
        System.out.println(c);

        //modulus op on floating point value
        float x = 12.8f, y = 3.1f;
        float z = x%y;
        System.out.println(z);

        //type conversion
        char ch = 'A';
        int res = ch-34;
        System.out.println(res);

        //precedence and associativity of arithmetic op
        System.out.println(2+3/2);
        System.out.println(2*4/2);
        System.out.println(10/2*5);
        System.out.println(2+4-5*2%2);



    }
}
