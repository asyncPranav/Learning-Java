package college;

public class StaticShow {

    //static variable
    static int count = initialiseVar();

    //static block
    static {
        System.out.println("Static block executed...");
    }

    //static method
    static public int initialiseVar(){
        System.out.println("Initialising static variable");
        return 0;
    }
    static public void staticMethod(){
        System.out.println("Inside Static method");
    }


    public static void main(String[] args) {
        System.out.println("Inside main method");
        staticMethod();

    }
}
