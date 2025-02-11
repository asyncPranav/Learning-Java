package $08_Methods;
import java.util.Arrays;

public class _17_Print_variable_no_of_strings {
    static void printStrings(String...x){
        //using counter controlled for loop
        for(int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        //using for each loop
        System.out.println("");
        for(String a : x){
            System.out.print(a+" ");
        }
        //using this way of printing array show that when no parameter is passed then it  print empty array or null array
        System.out.println("\n"+ Arrays.toString(x));
    }
    public static void main(String[] args) {
        printStrings();
        System.out.println("");
        printStrings("atul");
        System.out.println("");
        printStrings("ayush", "pranav", "atul");
        System.out.println("");
        printStrings(new String[]{"prince", "prashant", "mirza", "alok"});







    }
}
