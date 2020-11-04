package mdc.arrays;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods1 {
    public static void main(String[] args) {
        //List list = new ArrayList<>();

        List<Object> list = new ArrayList<>();

        list.add("dog");
        list.add(5);
        System.out.println(list);
        for(Object myObject: list){
            System.out.print(myObject + " ");
        }
        System.out.println();
        List<String> pets = new ArrayList<>();

        // add()
        pets.add("dog");
        System.out.println(pets);

        pets.add(0, "cat");
        System.out.println(pets);
        pets.add(2, "tiger");
        System.out.println(pets);
        pets.add(1, "parrot");
        System.out.println(pets);
        pets.add(0, "husky");
        System.out.println(pets);
        pets.add(1, "bird");
        System.out.println(pets);
        System.out.println("Inserting bird at position 0");
        pets.add(0, "bird");
        System.out.println(pets);
        System.out.println("Inserting maria at position 4");
        pets.add(4, "maria");
        System.out.println(pets);

        // remove()
        pets.remove("parrot");
        System.out.println(pets);

        pets.remove(2);
        System.out.println(pets);
        System.out.println();
        System.out.println("Setting position 0 to Dunieski");

        // set()
        pets.set(0, "Dunieski");
        System.out.println(pets);

        pets.add("lizard");
        pets.set(6, "HiHiHi");
        System.out.println(pets);
    }
}
