package mdc.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(createArray());

        // for loop
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <list.size(); i++){
            String temp = list.get(i);
            //System.out.println(temp);
        }
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for loop totalTime = " + totalTime + " ms");

        // foreach
        startTime = System.currentTimeMillis();
        for (String temp: list){
            String temp1 = temp;
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("foreach totalTime = " + totalTime + " ms");

        // iterator
        startTime = System.currentTimeMillis();
        for(Iterator<String> iterator = list.iterator(); iterator.hasNext();){
            String temp = iterator.next();
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("iterator totalTime = " + totalTime + " ms");

        // listIterator
        startTime = System.currentTimeMillis();
        for(ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext();){
            String temp = listIterator.next();
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("listIterator totalTime = " + totalTime + " ms");
    }

    private static String[] createArray(){
        String[] stringArray = new String[10_000];

        for(int i = 0; i < stringArray.length; i++){
            stringArray[i] = "Array " + i;
        }
        return stringArray;
    }
}
