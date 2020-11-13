package mdc.methods;

import java.util.ArrayList;
import java.util.List;

public class FinalVariables {
    private static final int SIZE = 10;
    private static final List<String> VALUES = new ArrayList<>();

    public static void main(String[] args) {
        int[] myArray = new int[SIZE];
        //System.out.println(myArray.length);
        //SIZE = 11; => this is wrong, variable SIZE is final
        //SIZE++; => this is wrong, variable SIZE is final

        int doubleSize = 2 * SIZE;
        System.out.println("doubleSize = " + doubleSize);

        for(int i = 0; i < SIZE; i++){
            System.out.println(myArray[i]);
        }
        VALUES.add("changed");
        System.out.println(VALUES);
        //VALUES = new ArrayList<>(); by the VALUES being final, you cannot do this
        // operation (adding new values like this)
        VALUES.add("added");

        //VALUES.remove(0);
        System.out.println(VALUES);

        final int myNumber = 10;
        //myNumber = 11;  does not compile because myNumber is final
    }
}
