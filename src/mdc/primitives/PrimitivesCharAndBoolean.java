package mdc.primitives;

public class PrimitivesCharAndBoolean {

    public static void main(String[] args) {
        char ch = 'a';

        //char ch1 = 'ab'; => this does not compile

        char ch1 = '1'; // returns 1
        char uniChar = '\u03A9'; // upper case greek omega character
        char romanNumber = '\u216C'; // roman 50 number
        char alpha = '\u03B1';
        char anotherSymbol = '\u263A';
        char delta = '\u0394';
        char lambda = '\u039B';

        System.out.println("ch1 = " + ch1);
        System.out.println("uniChar = " + uniChar);
        System.out.println("romanNumber = " + romanNumber);
        System.out.println("alpha = " + alpha);
        System.out.println("I am the " + alpha + " and the " + uniChar);
        System.out.println("AnotherSymbol = " + anotherSymbol);
        System.out.println("I like the airline " + delta);
        System.out.println("Let's go serverless and use " + lambda);

        // boolean myBoolean = "1"; => this does not compile
        // boolean myBoolean = "A"; => this does not compile

        boolean myBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myFalseBoolean = " + myFalseBoolean);
    }
}
