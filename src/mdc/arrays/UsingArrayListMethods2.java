package mdc.arrays;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods2 {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<>();
        System.out.println(pets.isEmpty()); // returns true
        System.out.println(pets.size()); // returns 0
        // isEmpty()
        if(pets.isEmpty()){
            System.out.println("no pets");
        }

        // size()
        if(pets.size() == 0 ){
            System.out.println("no pets");
        }

        pets.add("cat");
        System.out.println(pets.isEmpty()); // returns false
        System.out.println(pets.size()); // returns 1
        if(!pets.isEmpty()){
            System.out.println("yes pets");
        }

        // clear() -> empties the list
        pets.clear();
        System.out.println(pets.isEmpty()); // returns true
        System.out.println(pets.size()); // returns 0
        System.out.println(pets);

        // contains()
        pets.add("dog");
        System.out.println(pets.contains("dog")); // true
        System.out.println(pets.contains("cat")); // false

        List<String> newPets = new ArrayList<>();
        newPets.add("dog");

        System.out.println(pets.equals(newPets)); // true

        newPets.add("cat");
        System.out.println(pets.equals(newPets)); // false

        pets.add(0, "cat");
        System.out.println("Pets: " + pets);
        System.out.println("newPets: " + newPets);

        // size and elements are equal but the order of the elements is not equal
        System.out.println(pets.equals(newPets));

    }
}
