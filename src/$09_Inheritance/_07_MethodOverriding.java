package $09_Inheritance;

class Super{
    public void method1(){
        System.out.println("Super method 1");
    }
    public void method2(){
        System.out.println("Super method 2");
    }
}
class Sub extends Super{
    @Override
    public void method1(){
        System.out.println("Sub method 1");
    }
    public void method2(int n){
        System.out.println("Sub method 2");
    }
}
public class _07_MethodOverriding {
    public static void main(String[] args) {
        Super s1 = new Super();
        s1.method1();
        s1.method2();
        System.out.println();

        Sub s2 = new Sub();
        s2.method1();
        s2.method2();
        s2.method2(3);


    }

}
