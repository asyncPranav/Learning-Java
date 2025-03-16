package $15_Final_Keyword;

class Parent {
    final void display() {
        System.out.println("Display from Parent");
    }
}

class Child extends Parent {
    // void display() { // ❌ Error: Cannot override the final method
    //     System.out.println("Display from Child");
    // }
}

public class _02_FInalMethod {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Calls Parent's display method
    }
}
