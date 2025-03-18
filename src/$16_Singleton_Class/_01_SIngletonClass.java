package $16_Singleton_Class;

class CoffeeMachine{
    //properties
    private float coffeeQuantity;
    private float waterQuantity;

    //private non-parameterized constructor
    private CoffeeMachine(){
        coffeeQuantity = 1;
        waterQuantity = 1;
    }

    //method to create obj of CoffeeMachine
    //it return a new obj each time it get called
    public static CoffeeMachine getInstance(){
        return new CoffeeMachine();
    }


    //method to create obj of CoffeeMachine
    //it return a new obj if obj is not already created else return reference of the same object

    //property
    private static CoffeeMachine cm = null;

    //method
    public static CoffeeMachine getInstancee(){
        if(cm==null){
            cm = new CoffeeMachine();
        }
        return cm;
    }

}
public class _01_SIngletonClass {
    public static void main(String[] args) {
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        if(c1==c2){ //c1.equals(c2)
            System.out.println("c1 = "+c1);
            System.out.println("c2 = "+c2);
            System.out.println("c1 and c2 are same");
        }else{
            System.out.println("c1 = "+c1);
            System.out.println("c2 = "+c2);
            System.out.println("c1 and c2 are not same");
        }

        System.out.println();
        CoffeeMachine c3 = CoffeeMachine.getInstancee();
        CoffeeMachine c4 = CoffeeMachine.getInstancee();
        if(c3==c4){ //c3.equals(c4)
            System.out.println("c3 = "+c3);
            System.out.println("c4 = "+c4);
            System.out.println("c3 and c4 are same");
        }else{
            System.out.println("c3 = "+c3);
            System.out.println("c4 = "+c4);
            System.out.println("c3 and c4 are not same");
        }

    }
}
