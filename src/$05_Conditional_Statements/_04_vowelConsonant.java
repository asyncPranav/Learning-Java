package $05_Conditional_Statements;
import java.util.Scanner;

public class _04_vowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an alphabet : ");
        char ch1 = input.next().charAt(0);
        char ch = Character.toLowerCase(ch1);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch1 + " is vowel");
        } else {
            System.out.println(ch1 + " is consonant");
        }
        input.close();
    }
}
