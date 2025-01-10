package $04_String_Class_And_Printing;

public class _05_Regular_expression {
    public static void main(String[] args) {

        // . regex
        String str1 = "m";
        System.out.println(str1.matches("."));
        System.out.println("2".matches("."));
        System.out.println("$".matches("."));
        System.out.println("abc".matches("."));

        // [abc] regex
        System.out.println(" ");
        System.out.println("a".matches("[abc]"));
        System.out.println("b".matches("[abc]"));
        System.out.println("c".matches("[abc]"));
        System.out.println("d".matches("[abc]"));
        System.out.println("ab".matches("[abc]"));
        System.out.println("abc".matches("[abc]"));

        // [^abc] regex
        System.out.println(" ");
        System.out.println("a".matches("[^abc]"));
        System.out.println("b".matches("[^abc]"));
        System.out.println("c".matches("[^abc]"));
        System.out.println("d".matches("[^abc]"));
        System.out.println("4".matches("[^abc]"));
        System.out.println("#".matches("[^abc]"));
        System.out.println("dg".matches("[^abc]"));

        // [a-z0-9] regex
        System.out.println(" ");
        System.out.println("a".matches("[a-z0-9]"));
        System.out.println("x".matches("[a-z0-9]"));
        System.out.println("o".matches("[a-z0-9]"));
        System.out.println("9".matches("[a-z0-9]"));
        System.out.println("3".matches("[a-z0-9]"));
        System.out.println("#".matches("[a-z0-9]"));
        System.out.println("A".matches("[a-z0-9]"));
        System.out.println("A".matches("[a-zA-Z0-9]"));
        System.out.println("X".matches("[a-zA-Z0-9]"));

        // [a-z][0-9] regex
        System.out.println(" ");
        System.out.println("a".matches("[a-z][0-9]"));
        System.out.println("x".matches("[a-z][0-9]"));
        System.out.println("0".matches("[a-z][0-9]"));
        System.out.println("9".matches("[a-z][0-9]"));
        System.out.println("a2".matches("[a-z][0-9]"));
        System.out.println("x7".matches("[a-z][0-9]"));
        System.out.println("x#".matches("[a-z][0-9]"));

        // a|b regex
        System.out.println(" ");
        System.out.println("x".matches("a|b"));
        System.out.println("6".matches("a|b"));
        System.out.println("$".matches("a|b"));
        System.out.println("a".matches("a|b"));
        System.out.println("b".matches("a|b"));

        // abc regex
        System.out.println(" ");
        System.out.println("x".matches("abc"));
        System.out.println("4".matches("abc"));
        System.out.println("a".matches("abc"));
        System.out.println("ab".matches("abc"));
        System.out.println("abc".matches("abc"));
        System.out.println("bca".matches("abc"));

        // \d regex
        System.out.println(" ");
        System.out.println("1".matches("\\d"));
        System.out.println("8".matches("\\d"));
        System.out.println("47".matches("\\d"));
        System.out.println("a".matches("\\d"));
        System.out.println("$".matches("\\d"));

        // \D regex
        System.out.println(" ");
        System.out.println("a".matches("\\D"));
        System.out.println("#".matches("\\D"));
        System.out.println("1".matches("\\D"));
        System.out.println("23".matches("\\D"));
        System.out.println("ab".matches("\\D"));
        System.out.println("a#".matches("\\D"));

        // \s regex
        System.out.println(" ");
        System.out.println(" ".matches("\\s"));
        System.out.println("".matches("\\s"));
        System.out.println("  ".matches("\\s"));
        System.out.println("1".matches("\\s"));
        System.out.println("a".matches("\\s"));
        System.out.println("#".matches("\\s"));

        // \S regex
        System.out.println(" ");
        System.out.println("1".matches("\\S"));
        System.out.println("a".matches("\\S"));
        System.out.println("#".matches("\\S"));
        System.out.println("".matches("\\S"));
        System.out.println(" ".matches("\\S"));
        System.out.println("  ".matches("\\S"));

        // \w regex
        System.out.println(" ");
        System.out.println("a".matches("\\w"));
        System.out.println("x".matches("\\w"));
        System.out.println("1".matches("\\w"));
        System.out.println("9".matches("\\w"));
        System.out.println("$".matches("\\w"));
        System.out.println("-".matches("\\w"));

        // \W regex
        System.out.println(" ");
        System.out.println("a".matches("\\W"));
        System.out.println("x".matches("\\W"));
        System.out.println("1".matches("\\W"));
        System.out.println("8".matches("\\W"));
        System.out.println("48".matches("\\W"));
        System.out.println("".matches("\\W"));
        System.out.println(" ".matches("\\W"));
        System.out.println("#".matches("\\W"));
        System.out.println("-".matches("\\W"));

        // .* regex simultaneously
        System.out.println(" ");
        System.out.println("a".matches("."));
        System.out.println("1".matches("."));
        System.out.println("a1".matches("."));
        System.out.println("a1-89^".matches(".*"));
        System.out.println("a1nsjd983u839%$^&*".matches(".*"));

        // [abc]* regex simultaneously
        System.out.println(" ");
        System.out.println("a".matches("[abc]"));
        System.out.println("b".matches("[abc]"));
        System.out.println("c".matches("[abc]"));
        System.out.println("ab".matches("[abc]"));
        System.out.println("abc".matches("[abc]"));
        System.out.println("ab".matches("[abc]*"));
        System.out.println("abc".matches("[abc]*"));
        System.out.println("aabbcc".matches("[abc]*"));
        System.out.println("aabababcababcabacacab".matches("[abc]*"));

        // [a-z]* regex simultaneously
        System.out.println(" ");
        System.out.println("a".matches("[a-z]"));
        System.out.println("x".matches("[a-z]"));
        System.out.println("z".matches("[a-z]"));
        System.out.println("p".matches("[a-z]"));
        System.out.println("ap".matches("[a-z]"));
        System.out.println("a".matches("[a-z]*"));
        System.out.println("ap".matches("[a-z]*"));
        System.out.println("pranav".matches("[a-z]*"));
        System.out.println("redxcyber".matches("[a-z]*"));
        System.out.println("aaaaaaanjdksdsjkhwuiebciwh".matches("[a-z]*"));

        // [a-z]{5} regex simultaneously
        System.out.println(" ");
        System.out.println("a".matches("[a-z]"));
        System.out.println("az".matches("[a-z]"));
        System.out.println("az".matches("[a-z]{5}"));
        System.out.println("azzu".matches("[a-z]{5}"));
        System.out.println("azzzu".matches("[a-z]{5}"));
        System.out.println("pranu".matches("[a-z]{5}"));
        System.out.println("lions".matches("[a-z]{5}"));

        // [a-z]{5,10} regex simultaneously
        System.out.println(" ");
        System.out.println("azzu".matches("[a-z]{5,10}"));
        System.out.println("pranav".matches("[a-z]{5,10}"));
        System.out.println("atul".matches("[a-z]{5,10}"));
        System.out.println("papapaya".matches("[a-z]{5,10}"));
        System.out.println("elephants".matches("[a-z]{5,10}"));
        System.out.println("simultaneously".matches("[a-z]{5,10}"));


        //gmail pattern
        System.out.println(" ");
        String gmail1 = "pranav@gmail.com";
        System.out.println(gmail1.matches(".*gmail.*"));

        System.out.println(" ");
        String gmail2 = "pranav23@gmail.com";
        System.out.println(gmail2.matches("\\w*@gmail.(.*)"));

    }
}
