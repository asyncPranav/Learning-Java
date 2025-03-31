package $18_Exception_Handling;

class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions cant be negative therefore, cant calculate area.";
    }
}
public class _16_ThrowUserdefinedException {
    public static int area(int l, int b) throws NegativeDimensionException{
        if(l<0||b<0){
            throw new NegativeDimensionException();
        }
        int c = l*b;
        return c;
    }
    public static void meth1(){
        try {
            int a = area(-10, 5); //exception raised here
            System.out.println("Area is " + a); //therefore, this line will not execute
        }
        catch (NegativeDimensionException e){
            System.out.println("Error caused by -> "+e);
        }
    }
    public static void main(String[] args) {
        System.out.println("Start of the program");
        meth1();
        System.out.println("End of the program");
    }
}