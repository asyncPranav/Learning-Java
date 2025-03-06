package $09_Inheritance;
class Animal{
    public void sound(){
        System.out.println("Barking from parent");
    }
    public void legs(){
        System.out.println("4 from parent");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Barking from child");
    }
    public void legs(int n){
        System.out.println("4 from parent");
    }
    public void ears(){
        System.out.println("2 from child");
    }
}
public class _08_DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal ad = new Dog();
        ad.sound();
        ad.legs();
        //ad.legs(4);   --> it will give error
        //ad.ears();   --> it will give error
        //Explanation : Obsidian/Java-Doubts/Doubt-15
    }
}
