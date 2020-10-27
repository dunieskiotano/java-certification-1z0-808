package mdc.strings;

public class UnderstandingEquality {

    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java");

        System.out.println("one hash code => " + System.identityHashCode(one));
        System.out.println("two hash code => " + System.identityHashCode(two));
        System.out.println("one == two => " + (one == two));
        System.out.println("one hash code => " + System.identityHashCode(one));
        System.out.println("three hash code => " + System.identityHashCode(three));
        System.out.println("one == three => " + (one == three));

        // one has the same memory location as three
        one.append("HAHAHA");
        System.out.println(three);
        three.append("--------");
        System.out.println(one);
        System.out.println("one hash code => " + System.identityHashCode(one));
        System.out.println("three hash code => " + System.identityHashCode(three));


        String x = "Java";
        String y = "Java";
        String z = "Java";

        System.out.println("x == y => " +(x == y)); // true
        System.out.println("y == z => " +(y == z)); // true
        System.out.println("x == z => " +(x == z)); // true

        String a = "Java";
        String b = "Java".trim();
        // String b1 = "Java";  the same as b
        System.out.println("a == b: " + (a == b)); // true

        String c = "Java";
        String d = " Ja".trim() + "va";
        System.out.println("c == d: " + (c == d)); // false

    }
}
