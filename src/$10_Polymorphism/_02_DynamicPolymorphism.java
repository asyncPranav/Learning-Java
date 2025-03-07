package $10_Polymorphism;

class Super{
    protected void display(){
        System.out.println("Super display");
    }
}
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub display");
    }
}
public class _02_DynamicPolymorphism {
    public static void main(String[] args) {

        Super s; // Declaring a reference variable 's' of type Super

        s = new Super(); // Creating an object of the Super class and assigning it to 's'
        s.display(); // Calling the display method of the Super class

        s = new Sub(); // Creating an object of the Sub class and assigning it to 's' (Polymorphism)
        s.display(); // Calls the overridden display method of the Sub class (Runtime Polymorphism)
        
    }
}
