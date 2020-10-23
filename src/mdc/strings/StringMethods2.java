package mdc.strings;

public class StringMethods2 {
    public static void main(String[] args) {
        String str = "java";
        String str2 = "Java";
        String str3 = "ja";

        System.out.println("str.equals(str2) => " + str.equals(str2)); // returns false
        System.out.println("str.equalsIgnoreCase(str2) => " + str.equalsIgnoreCase(str2)); // returns true
        System.out.println("abc.equalsIgnoreCase('ABC') => " + "abc".equalsIgnoreCase("ABC")); // returns true

        // startsWith / endsWith
        System.out.println("str.startsWith('j') => " + str.startsWith("j")); // returns true
        System.out.println("str.startsWith(str3) => " + str.startsWith(str3)); // returns true
        System.out.println("str.startsWith(('J'.toLowerCase())) => " + str.startsWith(("J".toLowerCase())));// true
        System.out.println(str.endsWith("va")); // true

        // contains
        System.out.println(str.contains(str3)); // returns true
        System.out.println(str.contains("av")); // true
        System.out.println("Java".contains("j".toUpperCase())); // true

        // replace
        String myString = "Java" + " " + "is" + " " + "cool";
        System.out.println(myString.replace('a', 'A'));
        System.out.println(myString.replace(" ", "_"));
        System.out.println(myString.replace("is", "_"));
        System.out.println(myString);

        // trim
        System.out.println("Java".trim());
        System.out.println(" Java is cool  ");
        System.out.println(" Java is cool  ".trim());
        String myString1 = "Java is cool";
        String myString2 = "     Java is cool      ".trim();

        System.out.println("myString1 == myString2 => " + myString1 == myString2); // returns false
        System.out.println("myString1 hash code = " + System.identityHashCode(myString1)); // returns 818403870
        System.out.println("myString2 hash code = " + System.identityHashCode(myString2)); // returns 1531333864
        System.out.println("myString1.equals(myString2) => " + myString1.equals(myString2)); // returns true



    }
}
