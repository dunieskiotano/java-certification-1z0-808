package mdc.strings;

import java.util.Scanner;

public class StringMethods {
    static int number;

    public static void main(String[] args) {
        // 0   1   2   3   4   5   6   7   8    9    10 ==> index is always length - 1
        // J   a   v   a      i    s      f     u    n => length = 11
        String str = "Java is fun";

        // length
        System.out.println("length = " + str.length()); // returns length = 11

        //chat at
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 0 to 10 >> ");
        number = input.nextInt();
        if (number < 0 || number > 10){
            System.out.println("Invalid entry again");
        }else {
            if (str.charAt(number) == ' ')
                System.out.println("element at position " + number + " : empty space");
            else
                System.out.println("element at position " + number + " : " + str.charAt(number));
        }
        //System.out.println(str.charAt(2));
        //System.out.println(str.charAt(6));

        // index of
        System.out.println(str.indexOf('a')); // where in the array is 'a'
        System.out.println(str.indexOf('a', 2)); // character 'a' starting at position 2
        System.out.println(str.indexOf("fun")); // returns 8 bc the fun starts at index 8
        System.out.println(str.indexOf("f", 10)); // returns -1
        System.out.println(str.indexOf('n')); // returns 10
        System.out.println(str.indexOf("Java", 2)); // returns -1
        System.out.println(str.indexOf("n", 10)); // returns 10
        System.out.println(str.indexOf("Java", 0)); // returns 0

        // substring
        System.out.println(str.substring(6));
        System.out.println(str.substring(0, 5)); // returns "Java " because the "ToIndex" value is NOT inclusive
        System.out.println(str.substring(4, 4)); // returns an empty string when the fromIndex and toIndex are the same
        System.out.println(str.substring(3, 3)); // returns an empty string when the fromIndex and toIndex are the same
        //System.out.println(str.substring(14, 14)); // returns StringIndexOutOfBoundsException
        //System.out.println(str.substring(4, 2)); // returns StringIndexOutOfBoundsException because the fromIndex value
        // is bigger than the toIndex value
        //System.out.println(str.substring(8, 14)); // returns StringIndexOutOfBoundsException because index 14 does not exist

        // toLowerCase()
        System.out.println("AbCd".toLowerCase()); // returns abcd
        System.out.println(str.toUpperCase()); // JAVA IS FUN
        //str.toUpperCase(); is completely ignored because the expression returns a new string
        System.out.println(str); // this will print the original string "Java is fun"

        String dog = "Lucky";
        System.out.println("dog hash code = " + System.identityHashCode(dog));
        //dog.toUpperCase(); will not do anything bc strings are immutable
        dog = dog.toUpperCase();
        System.out.println("dog hash code = " + System.identityHashCode(dog));
        System.out.println(dog);



    }
}
