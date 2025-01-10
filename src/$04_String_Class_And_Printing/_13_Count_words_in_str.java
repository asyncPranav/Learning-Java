package $04_String_Class_And_Printing;

import java.util.Scanner;

public class _13_Count_words_in_str {
    public static void main(String[] args) {

        //Problem : count no of words present in strings

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();
        input.close();

        //remove leading, tailing and extra spaces in between
        str = str.replaceAll("\\s+", " ").trim();

        //split string in to words
        String[] words = str.split("\\s");

        //no of words
        int words_count = words.length;
        System.out.println("Total number of words : "+words_count);

    }
}
