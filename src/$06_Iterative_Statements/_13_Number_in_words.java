package $06_Iterative_Statements;
import java.util.Scanner;

public class _13_Number_in_words {
    public static void main(String[] args) {

        //display a number in words : 123 -> one two three
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        //take number as a string then
        //reverse the number because if we do not reverse the number then we will get words in reverse order
        //123 -> three two one
        String str = num+"";
        String rev = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            rev = rev+ch;
        }

        for(int i=0; i<rev.length(); i++){
            char ch = rev.charAt(i);
            switch(ch){
                case '0' :
                    System.out.print("zero ");
                    break;
                case '1' :
                    System.out.print("one ");
                    break;
                case '2' :
                    System.out.print("two ");
                    break;
                case '3' :
                    System.out.print("three ");
                    break;
                case '4' :
                    System.out.print("four ");
                    break;
                case '5' :
                    System.out.print("five ");
                    break;
                case '6' :
                    System.out.print("six ");
                    break;
                case '7' :
                    System.out.print("seven ");
                    break;
                case '8' :
                    System.out.print("eight ");
                    break;
                case '9' :
                    System.out.print("nine ");
                    break;
                default: System.out.println("Invalid digit !!");

            }
        }

    }
}
