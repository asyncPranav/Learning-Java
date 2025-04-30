package practical;
class Parent{
    public void show(){
        System.out.println("Parent-method");
    }
}
class Child extends Parent{
    public void show(){
        System.out.println("Child-method");
    }
}
public class _08_MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();

        //it shows overriding
        Child c = new Child();
        c.show();

        Parent pc = new Child();
        pc.show();
    }
}
