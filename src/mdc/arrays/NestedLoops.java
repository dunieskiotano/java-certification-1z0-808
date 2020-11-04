package mdc.arrays;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {
        for(int hours = 1; hours <= 6; hours++){
            for (int minutes = 0; minutes < 60; minutes++){
                System.out.println(hours + ":" +  minutes);
            }
        }
        // hours = 1 minutes 0 - 59  => 60
        // hours = 2 minutes 0 - 59 => 60
        // hours = 3 minutes 0 - 59 => 60
        // hours = 4 minutes 0 - 59 => 60
        // hours = 5 minutes 0 - 59  => 60
        // hours = 6 minutes 0 - 59  => 60
        // 420 times

        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12, 13}
        };
        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));


        OUTER:
        for (int[] rowArray : myArray){
            INNER:
            for(int i = 0; i < rowArray.length; i++){
                System.out.print(rowArray[i] + " ");
            }
        }

        System.out.println();
        int x = 10;
        while (x > 0){
            do {
                // 1. executes until x = 5
                // 3. x = 3
                // 5. x = 1
                x -= 1; // => x = x - 1, x--
            }while(x > 5);
            // 2. x-- -> x = 4
            // 4. x-- -> x = 2
            // 6. x-- -> x = 0
            x--;
            System.out.println(x);
            // print 4
            // print 2
            // print 0
        }
    }
}
