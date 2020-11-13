package mdc.methods;

public class StaticMethodsAndFields {
    public static int myNumber = 10;
    static{
        myNumber = 40;
    }
    public static int myNumber2 = 20;
    public static int myNumber3;
    public static String string;
    public static double myDouble;
    public static Object object;

    public static void main(String[] args) {
        System.out.println(myNumber);
        System.out.println(myNumber2);
        System.out.println(myNumber3);
        System.out.println(string);
        System.out.println(myDouble);
        System.out.println(object);
        System.out.println();
    }


}
