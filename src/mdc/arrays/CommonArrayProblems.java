package mdc.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonArrayProblems {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // array of 5 elements, index 0 - 4
        for(int i = 0; i < numbers.length; i++){
            System.out.println(i + " - " + numbers[i]);
        }

        System.out.println("**********************");
        for(int i = 1; i < numbers.length - 1; i++){
            System.out.println(i + " - " + numbers[i]);
        }

        //int[20] nums; size ony at initialization
        int[] nums = new int[20];
        System.out.println(Arrays.toString(nums));
        //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        //int size = numbers.length(); => this will not compile because length is not a method
        int size = nums.length;
        System.out.println("size = " + size);

       // numbers.length = 10; => this does not compile because you can't set the length of an array
        // like it was done above, only initialization
        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add("Name");
        list.add(true);
        for(Object number: list){
            System.out.println(number);
        }

        list.add(10);
        list.add(13);
        for(Object number: list){
            System.out.println(number);
        }
    }
}
