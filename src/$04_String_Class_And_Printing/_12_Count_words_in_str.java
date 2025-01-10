package $04_String_Class_And_Printing;
import java.util.Scanner;

public class _12_Count_words_in_str {
    public static void main(String[] args) {

        //Problem : count no of words present in strings

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();
        input.close();

        //remove leading, tailing and extra spaces in between
        str = str.replaceAll("\\s+", " ").trim();

        //count no of words
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        System.out.println("Total words : "+(count+1));
    }
}
