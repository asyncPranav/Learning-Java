package $06_Iterative_Statements;
import java.util.Scanner;

public class _15_Number_in_words {
    public static void main(String[] args) {

        //display a number in words : 123 -> one two three
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        //take out digit of number and form a string of it
        String str = "";
        for(int i=num; i>0; i/=10){
            int rem = i%10;
            str = str+rem; // -> it will form string in reverse order
        }

        //print each digit in words
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
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
                    System.out.print("four");
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
