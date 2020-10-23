package mdc.strings;

public class MethodChaining {
    public static void main(String[] args) {
        String start = "   Java   ";

        System.out.println("untrimmed = " + start); // returns "   Java   "
        String trimmed = start.trim();
        System.out.println("trimmed = " + trimmed); // returns "Java"

        String lowerCase = trimmed.toLowerCase();
        System.out.println("lowerCase = " + lowerCase);  // returns java

        String result = lowerCase.replace('j', 'J');
        System.out.println("result = " + result); // returns Java

        String str = "Java";
        String anotherResult = "  Java   ".trim().toLowerCase().replace('j', 'J');
        //"  Java   ".trim() => toLowerCase() => replace('j', 'J')
        System.out.println("anotherResult = " + anotherResult);
        System.out.println(result.equals(anotherResult)); // returns true
        System.out.println(result.equals(str)); // returns true
        System.out.println(result == anotherResult); // returns false
        System.out.println(result == str); // returns false

        String a = "abc"; // a = abc
        String b = a.toUpperCase(); // this does not change the value of a => b = "ABC"
        String c = b.replace('B', 'b').replace('C', 'c'); // c = Abc
        // c = AbC => Abc
        System.out.println("a = " + a); // returns abc
        System.out.println("b = " + b); // returns ABC
        System.out.println("c = " + c); // // returns Abc

        if(a.equalsIgnoreCase(b)){
            System.out.println("Strings are equal");
        }
        if(a.toLowerCase().trim().equals(b.toLowerCase().trim())){
            System.out.println("Equal");
        }
    }
}
