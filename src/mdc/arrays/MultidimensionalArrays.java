package mdc.arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // 1d array
        int[] myArray = {0, 1};
        int[] myNewArray = new int[5];

        // 2 d array
        int[][] array = new int[2][4]; // 2 rows and 4 is the columns where 2 is length of the array
        System.out.println(array.length);
        int anotherArray[][] = new int[2][4];

        int[] myIntArray[] = new int[2][4];

        String[][] my2dArray = new String[][]{
                {"One", "Two"}, // 1st row with 2 elements
                {"Three", "Four", "Five"}, // 2nd row with 3 elements
                {"Six", "Seven", "Eight", "Nine"}, // 3rd row with 4 elements
                null};

        System.out.println(my2dArray[0][1]); // Prints "Two"
        System.out.println(my2dArray[2][2]); // Prints "Eight"

        int[][] numberTable = new int[2][3];
        numberTable[0][0] = 1;
        numberTable[0][1] = 2;
        numberTable[0][2] = 3;
        //numberTable[0][3] = 1; // out of bounds
        //System.out.println(numberTable[0][3]);

        // 3d array
        // pages(planes), rows, columns

        int[][][] threeArray = new int[3][3][3];
        System.out.println(threeArray.length);
        threeArray[0][0][1] = 1;

        int oneMoreThreeArray[][][] = new int[3][3][3];

        int[] anotherThreeArray[][] = new int[3][3][3];

        int[][] anotherMoreThreeArray[] = new int[3][3][3];

        int[][][] threeDArray = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 14}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
        System.out.println(threeDArray[0][2][2]); // returns 9
        System.out.println(threeDArray[2][1][2]); // returns 24
        System.out.println(threeDArray[1][2][2]);  // returns 18
        System.out.println(threeDArray[1][0][1]);  // returns 11
    }
}

