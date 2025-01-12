//this program does not work for number with tailing zero ->> 1700
//because of reverse of 1700 will be 71 then
//words -> one seven
//check next program to see its solution

package $06_Iterative_Statements;
import java.util.Scanner;

public class _12_Number_in_words {
    public static void main(String[] args) {

        //display a number in words : 123 -> one two three
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        //first we have to reverse the number because if we do not reverse the number then we will get words in reverse order
        //123 -> three two one
        int rev=0;
        for(int i=num; i>0; i/=10) {
            int rem = i % 10;
            rev = rev*10+rem;
        }

        for(int i=rev; i>0; i/=10){
            int rem = i%10;
            switch(rem){
                case 0 :
                    System.out.print("zero ");
                    break;
                case 1 :
                    System.out.print("one ");
                    break;
                case 2 :
                    System.out.print("two ");
                    break;
                case 3 :
                    System.out.print("three ");
                    break;
                case 4 :
                    System.out.print("four ");
                    break;
                case 5 :
                    System.out.print("five ");
                    break;
                case 6 :
                    System.out.print("six ");
                    break;
                case 7 :
                    System.out.print("seven ");
                    break;
                case 8 :
                    System.out.print("eight ");
                    break;
                case 9 :
                    System.out.print("nine ");
                    break;
                default: System.out.println("Invalid digit !!");

            }
        }
    }
}
