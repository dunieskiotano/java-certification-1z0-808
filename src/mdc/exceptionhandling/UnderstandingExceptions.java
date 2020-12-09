package mdc.exceptionhandling;

import java.util.Arrays;

public class UnderstandingExceptions {
    public static void main(String[] args) {
        int[] myArray = new int[2];
        myArray[0] = 2;
        myArray[1] = 10;
        myArray[1] = 5;
        System.out.println(myArray[0]);
        System.out.println(Arrays.toString(myArray));
    }
}
