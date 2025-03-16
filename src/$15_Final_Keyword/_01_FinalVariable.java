package $15_Final_Keyword;

class Test{
    final int MIN = 1;
    final static int NORMAL;
    final int MAX;

    static {
        NORMAL = 5;
    }
    Test(){
        MAX = 10;
    }
}
public class _01_FinalVariable {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("MAX : "+t.MAX);
        System.out.println("NORMAL : "+t.NORMAL);
        System.out.println("NORMAL : "+Test.NORMAL);
        System.out.println("MIN : "+t.MIN);
    }
}
