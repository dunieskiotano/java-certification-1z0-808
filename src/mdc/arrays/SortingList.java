package mdc.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        List<Integer> nums = new ArrayList<>();
        nums.add(500);
        nums.add(10);
        nums.add(9);
        nums.add(50);
        nums.add(40);

        List<Integer> convertedArrayOfInt =new ArrayList<>();
        for (String num : numsList){
            int n = Integer.parseInt(num);
            convertedArrayOfInt.add(n);
        }

        List<String>  words = new ArrayList<>();
        words.add("Xercious");
        words.add("Dubious");
        words.add("Elementary");
        words.add("Apple");
        words.add("Boy");



        System.out.println(numsList);
        Collections.sort(numsList);
        System.out.println(numsList);

        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);


        System.out.println("Unsorted List:");
        System.out.println(convertedArrayOfInt);
        Collections.sort(convertedArrayOfInt);
        System.out.println("Sorted List:");
        System.out.println(convertedArrayOfInt);

        List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        List<Object> list = Arrays.asList("Dunieski", 7, 10, true, 34.5);
        System.out.println(list);
        list.set(0, "DunieskiOtano");
        System.out.println(list);
        //list.add("Duni"); this is not allowed
    }
}
