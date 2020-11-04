package mdc.arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 2};
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));

        for(int i = 0; i < numbers.length; i++){
            //System.out.println(numbers[i] + " ");
            System.out.print(numbers[i] + " ");
        }

        int num = Integer.parseInt("500");

        System.out.println("This is the converted number => " + num);

        String[] strings = {"50", "9", "500", "600", "800"};
        System.out.println();
        int[] newNums= new int[strings.length];

        int index = 0;
        for (String string: strings){
            int nums = Integer.parseInt(string);
            newNums[index] = nums;
            index++;
        }
        System.out.println(Arrays.toString(newNums));

        //Arrays.sort(strings);
        //System.out.println(Arrays.toString(strings));

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals)); // returns [Bird, Cat, Dog, Lizard, Snake]
    }
}
