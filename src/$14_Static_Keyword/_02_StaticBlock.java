package $14_Static_Keyword;

class Test{
    static int x;

    static {
        System.out.println("Static block-01");
        x=10;
    }
    static {
        System.out.println("Static block-02");
    }
}
public class _02_StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method");
        Test t = new Test();
    }
}

