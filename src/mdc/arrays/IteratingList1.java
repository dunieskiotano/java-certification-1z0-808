package mdc.arrays;

import java.util.*;

public class IteratingList1 {

    public static void main(String[] args) {

        int counter = 0;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        // for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("element at index " + i + " is " + numbers.get(i));
        }
        // enhanced for loop/foreach
        for (Integer number : numbers) {
            System.out.println("number at index " + counter + " => " + number);
            counter++;
        }

        // Iterator
        for (Iterator<Integer> numIterator = numbers.iterator(); numIterator.hasNext(); ) {
            Integer number = numIterator.next();
            System.out.println(number);
            //numIterator.remove();
        }

        // listIterator

        //List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        for (ListIterator<Integer> listIterator = numbers.listIterator(2); listIterator.hasPrevious(); ) {
            System.out.println(listIterator.previous());
        }

        System.out.println(numbers);

        List<Integer> iterateNums = new ArrayList<>();
        iterateNums.add(1);
        iterateNums.add(2);
        iterateNums.add(3);
        iterateNums.add(4);

        // iterator => forward traversal
        Iterator<Integer> itr = iterateNums.iterator();
        System.out.println("Iterator: ");
        System.out.println("Forward Traversal:");
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
        System.out.println();

        // listIterator forward traversal
        ListIterator<Integer> i = iterateNums.listIterator();
        System.out.println("ListIterator");
        System.out.println("Forward Traversal:");
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
        System.out.println();
        System.out.println("Backward Traversal:");
        while (i.hasPrevious()) {
            System.out.println(i.previous() + " ");
        }
        System.out.println();

        //WORM - Write Once, Run Many
    }
}
