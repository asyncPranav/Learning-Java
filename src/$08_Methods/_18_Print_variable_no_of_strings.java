package $08_Methods;

public class _18_Print_variable_no_of_strings {
    //print all names without numbering
    static void printStrings1(String...X){
        for(int i=0; i<X.length; i++){
            System.out.println(X[i]);
        }
    }
    //print names with numbering start from 1
    static void printStrings2(String...X){
        for(int i=0; i<X.length; i++){
            System.out.println(i+1+". "+X[i]);
        }
    }
    //print names with numbering but it takes starting number from user
    //method taking variable arguments can also take more arguments but that argument must be other than variable argument
    //here we are passing two arguments first is of type int and second is variable argument
    static void printStrings3(int start, String...X){
        for(int i=0; i<X.length; i++){
            System.out.println(start+". "+X[i]);
            start++;
        }
    }
    public static void main(String[] args) {
        printStrings1("atul","pranav","ayush");
        System.out.println("--------------------------------------");
        printStrings2("atul","pranav","ayush");
        System.out.println("--------------------------------------");
        printStrings3(5,"atul","pranav","ayush");



    }
}
