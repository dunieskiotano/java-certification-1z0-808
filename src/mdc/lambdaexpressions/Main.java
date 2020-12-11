package mdc.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] n = new String[]{"Dunieski", "Carlos", "Maria", "Anant", "Ievgeniia"};
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.add(1);
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println();
        for(Integer number: numbers) System.out.print(number + " ");
        System.out.println();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < n.length; i++){
            names.add(n[i]);
        }
        //System.out.println(names);
        System.out.println();
        names.forEach(name -> System.out.print(name + " "));


    }
}
