package $18_Exception_Handling;

public class _06_UncheckedException {
    public static void meth1(){
        //this is an Unchecked Exception, compiler does not check it and also does not force to handle it
        //System.out.println(10/0);

        //let's handle this exception, instead of letting it go
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
    public static void meth2(){
        meth1();
    }
    public static void main(String[] args) {
        meth2();
    }
}
