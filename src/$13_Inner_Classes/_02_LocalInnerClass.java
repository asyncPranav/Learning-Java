package $13_Inner_Classes;

class External{
    void externalDisplay(){
        class Internal{
            void internalDisplay(){
                System.out.println("Hello from Internal");
            }
        }
        Internal i = new Internal();
        System.out.println("\n---- Using Reference and Object -----");
        i.internalDisplay();

        /*
            -> we can create anonymous object to call internalDisplay() method
            -> anonymous object does not have any reference
            ->it will create object and simultaneously it will call the method
         */
        System.out.println("\n---- Using Anonymous Object -----");
        new Internal().internalDisplay();
    }

}
public class _02_LocalInnerClass {
    public static void main(String[] args) {
        External e = new External();
        e.externalDisplay();
    }
}
