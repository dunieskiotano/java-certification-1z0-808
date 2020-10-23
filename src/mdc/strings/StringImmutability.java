package mdc.strings;

public class StringImmutability {
    public static void main(String[] args) {
        String hello = "hello";
        String hi = hello + "world"; // hi = "helloworld"
        hi = hello; // hi = "hello"

        System.out.println();
        System.out.println(hi + hello); // => returns hellohello

        hello = hello.toUpperCase();
        System.out.println(hello); // => returns HELLO

        // concat
        String s1 = "1";
        String s2 = s1.concat("2");
        //s2.concat("3"); this is completely ignored

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.concat("3"));
        //System.out.println(s3);
    }
}
