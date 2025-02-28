package $09_Inheritance;

class Parent{
    public Parent(){
        System.out.println("Parent constructor");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child constructor");
    }
}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("Grand child constructor");
    }
}
public class _02_InheritConstructor {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("-------------------------------------");
        Child c = new Child();
        System.out.println("-------------------------------------");
        GrandChild g = new GrandChild();
    }
}
