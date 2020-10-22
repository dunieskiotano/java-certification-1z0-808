package mdc.main;

public class DefaultInitialization {

    static boolean myBoolean;
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;
    // static String myString; => this is NOT a primitive
    // static Object myObject; => this is NOT a primitive either

    public static void main(String[] args) {
        int localInt;

        // System.out.println("LocalInt = " + localInt); => this does not compile because the variable
        // localInt is not initialized

        System.out.println("myBoolean = " + myBoolean); // default values is false
        System.out.println("myByte = " + myByte); // default values is 0
        System.out.println("myShort = " + myShort); // default values is 0
        System.out.println("myInt = " + myInt); // default values is 0
        System.out.println("myLong = " + myLong); // default values is 0
        System.out.println("myFloat = " + myFloat); // default values is 0.0
        System.out.println("myDouble = " + myDouble); // default values is 0.0
        System.out.println("myChar = " + myChar); // default values is '\u0000'
        //System.out.println("myObject = " + myObject);

    }
}


