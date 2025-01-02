package $04_String_Class_And_Printing;

public class _04_String_methods {
    public static void main(String[] args) {
        String str = "Pranav";

        //length() method
        int length = str.length();
        System.out.println("Lenght of " + str + " : " + length);

        //toLowerCase() method
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);
        System.out.println(str); //original value does not change

        //toUpperCase() method
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);

        //trim() method
        String spaceStr = "   Pranav singh   ";
        String trimStr = spaceStr.trim();
        System.out.println(trimStr);

        //substring() method
        String subStr1 = str.substring(2);
        System.out.println(subStr1);
        String substr2 = str.substring(1,5);
        System.out.println(substr2);

        //replace() method
        String repStr = str.replace('v', 'y');
        System.out.println(repStr);

        //startsWith() method
        boolean startStr = str.startsWith("Pr");
        System.out.println(startStr);
        System.out.println("www.redxcyber.me".startsWith("www"));
        System.out.println("www.redxcyber.me".endsWith(".org"));

        //charAt() method
        char ch = str.charAt(2);
        System.out.println(ch);
        System.out.println("ATUL".charAt(2));

        //lastIndexOf() method
        int startIndex = str.indexOf('a');
        System.out.println(startIndex);
        int lastIndex = str.lastIndexOf('a');
        System.out.println(lastIndex);
        System.out.println("papaya".indexOf('a'));
        System.out.println("papaya".lastIndexOf('a'));

        //equals() method
        String str1 = "Pranav";
        String str2 = "pranav";
        String str3 = "redxcyber";
        String str4 = "redxcyber";
        boolean isEqual1 = str3.equals(str4);
        System.out.println(isEqual1);
        boolean isEqual2 = str1.equals(str2);
        System.out.println(isEqual2);
        boolean isEqual3 = str1.equalsIgnoreCase(str2);
        System.out.println(isEqual3);

        //compareTo() method
        int compare1 = str2.compareTo(str3);
        System.out.println(compare1);
        int compare2 = str3.compareTo(str2);
        System.out.println(compare2);
        int compare3 = str1.compareTo(str2);
        System.out.println(compare3);
        int compare4 = str3.compareTo(str4);
        System.out.println(compare4);

        //compareToIgnoreCase() method
        int ignoreCompare1 = str1.compareToIgnoreCase(str2);
        System.out.println(ignoreCompare1);
        int ignoreCompare2 = str1.compareToIgnoreCase(str3);
        System.out.println(ignoreCompare2);

        //different between equals() and ==
        String str5 = new String("redxcyber");
        boolean strEqual1 = str3.equals(str4);
        System.out.println(strEqual1);
        boolean strEqual2 = str3==str4;
        System.out.println(strEqual2);
        boolean strEqual3 = str3.equals(str5);
        System.out.println(strEqual3);
        boolean strEqual4 = str3==str5;
        System.out.println(strEqual4);

        //contains() method
        String name = "Pranav singh chandel";
        boolean check = name.contains("singh");
        System.out.println(check);

        //concat() method
        String concatedStr = str1.concat(str3);
        System.out.println(concatedStr);










    }
}
