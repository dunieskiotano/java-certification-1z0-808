package mdc.arrays;

import java.util.Arrays;

public class SearchingArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7};

        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(numbers[2] + " has index " + Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 10));
        System.out.println(Arrays.binarySearch(numbers, 11));

        int[] notSortedNumbers = {5, 4, 10, 8, 6};

        Arrays.sort(notSortedNumbers);

        System.out.println(Arrays.toString(notSortedNumbers));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 8));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 10));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 6));


    }
}
