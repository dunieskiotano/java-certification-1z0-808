package mdc.arrays;

import java.util.Arrays;

public class UsingArrays {

    public static void main(String[] args) {
        String[] pets = {"parrot", "cat", "dog"};
        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);
        //System.out.println(pets[3]); => throws ArrayIndexOutOfBounds since we only have 3 elements

        pets[0] = "bird";
        System.out.print("Modified Array => ");
        for (String bird: pets){
            System.out.print(bird + " ");  // returns bird cat dog
        }

        System.out.println();
        for(int i = 0; i < pets.length - 1; i++){
            System.out.println(pets[i]); // returns bird cat
        }
        System.out.println(pets);
        System.out.println(Arrays.toString(pets));

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 10;
            // 1. iteration i = 0
            // numbers[0] = 0 + 10 => 10
            // 2. iteration i = 1
            // numbers[1] = 1 + 10 => 11
            // 3. iteration i = 2
            // numbers[2] = 2 + 10 => 12
            // 4. iteration i = 3
            // numbers[3] = 3 + 10 => 13
            // 5. iteration i = 4
            // numbers[4] = 4 + 10 => 14
            // [10, 11, 12, 13, 14]
        }
        System.out.println(Arrays.toString(numbers));

        for(int i = 0; i < numbers.length; i++){
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        Integer[] nums = new Integer[4];
        System.out.println(Arrays.toString(nums)); // [null, null, null, null]

        String[] strings = new String[6];
        System.out.println(Arrays.toString(strings));// [null, null, null, null, null, null]

        for(int i = 0; i < nums.length; i++){
            nums[i] = i % 3;
            // 1. iteration 0 => 0 % 3 = remainder => 0
            // 2. iteration 1 => 1 % 3 = remainder => 1
            // 3. iteration 2 => 2 % 3 = remainder => 2
            // 4. iteration 3 => 3 % 3 = remainder => 0
        }
        System.out.println(Arrays.toString(nums));
    }
}
