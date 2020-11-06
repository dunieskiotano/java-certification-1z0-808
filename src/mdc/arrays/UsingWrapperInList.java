package mdc.arrays;

import java.util.ArrayList;
import java.util.List;

public class UsingWrapperInList {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5); // autoboxing
        doubleList.add(new Double(55.10));
        doubleList.remove(55.10); // autoboxing
        double first = doubleList.get(0); // get(<index_number>)
        System.out.println(doubleList);
        System.out.println(first);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        System.out.println(numbers);

        //int number = numbers.get(0); // throws a NullPointerException, it cannot hold/be null
        Integer number = numbers.get(0);
        System.out.println(number);


        List<Integer> nums = new ArrayList<>();
        nums.add(1); // index 0
        nums.add(2); // index 1
        nums.remove(1); // this will remove element at position 1

        //nums.remove(new Integer(1)); this will remove element with value 1
        System.out.println(nums); // returns 1
    }
}
