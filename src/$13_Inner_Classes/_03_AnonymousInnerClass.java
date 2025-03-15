package $13_Inner_Classes;

abstract class Test{
    abstract public void display();
}
class Outerr{
    void method(){
        /*
        Test t = new Test(){
            @Override
            void display() {
                System.out.println("Hello from Anonymous for Abstract class");
            }
        };
        t.display();
         */

        Test t = new Test(){public void display(){System.out.println("Hello from Anonymous for Abstract class");}};
        System.out.println("\n---- Using Reference and Object -----");
        t.display();

        /*
            -> we can create anonymous object to call internalDisplay() method
            -> anonymous object does not have any reference
            ->it will create object and simultaneously it will call the method
         */
        System.out.println("\n---- Using Anonymous Object -----");
        new Test(){public void display(){System.out.println("Hello from Anonymous for Abstract class");}}.display();

    }
}

//------------------------------------------------//

interface My{
    void display();
}
class Outerrr{
    void method(){
        /*
        My m = new My(){
            @Override
            public void display() {
                System.out.println("Hello from Anonymous for Interface");
            }
        };
        m.display();
         */

        My m = new My(){public void display(){System.out.println("Hello from Anonymous for Interface");}};
        System.out.println("\n---- Using Reference and Object -----");
        m.display();

         /*
            -> we can create anonymous object to call internalDisplay() method
            -> anonymous object does not have any reference
            ->it will create object and simultaneously it will call the method
         */
        System.out.println("\n---- Using Anonymous Object -----");
        new My(){public void display(){System.out.println("Hello from Anonymous for Interface");}}.display();

    }
}

public class _03_AnonymousInnerClass {
    public static void main(String[] args) {
        Outerr o1 = new Outerr();
        o1.method();

        Outerrr o2 = new Outerrr();
        o2.method();

    }
}
