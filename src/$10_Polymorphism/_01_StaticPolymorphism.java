package $10_Polymorphism;

class StaticPolymorphism{
    //max of two numbers
    public int max(int x, int y){
        return (x>y) ? x : y;
    }

    //max of three numbers
    public int max(int x, int y, int z){
        return (x>y && x>z) ? x : (y>z) ? y : z;
    }
}
public class _01_StaticPolymorphism {
    public static void main(String[] args) {
        StaticPolymorphism sp = new StaticPolymorphism();
        System.out.println("Max of two numbers : "+sp.max(2,4));
        System.out.println("Max of three numbers : "+sp.max(2,4,6));
    }
}
