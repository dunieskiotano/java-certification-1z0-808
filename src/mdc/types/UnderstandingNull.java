package mdc.types;

public class UnderstandingNull {

    static Object myObject = new Object();
    static Object myOtherObject;
    static String myString;

    public static void main(String[] args) {
        Object myLocalObject = new Object();
        Object anotherLocalObject;

        String name = "Java";
        String anotherName = null;

        System.out.println();
        System.out.println("myObject = " + myObject); // this returns java.lang.Object@880ec60 based on your PC
        System.out.println("myOtherObject = " + myOtherObject);

        System.out.println("myLocalObject = " + myLocalObject); // this returns java.lang.Object@7f63425a based on your PC
        //System.out.println("anotherLocalObject = " + anotherLocalObject); => This does not compile because the variable
        // myLocalObject is not initialized

        System.out.println("name = " + name);
        System.out.println("anotherName = " + anotherName); // This returns null

        myString = "Java";

        System.out.println("myString = " + myString);
        String newString = myString.toLowerCase();
        myString.toLowerCase(); // this does not return anything because Strings are immutable in Java and
        // the result of this is ignored => myString.toLowerCase()
        String upperString = myString.toUpperCase();
        int len = upperString.length(); // this returns 4
        System.out.println("myString = " + upperString); // this returns JAVA
        System.out.println("The length of " + upperString + " is " + len); // this returns The length of JAVA is 4
    }
}
