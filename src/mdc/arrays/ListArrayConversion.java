package mdc.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");


        System.out.println(names);
        Object[] namesArray = names.toArray(); // converts the list to an array of type Object
        System.out.println(Arrays.toString(namesArray));

        System.out.println(namesArray.length);

        String[] stringArray = names.toArray(new String[0]); // converts the list to an array of type String
        System.out.println(Arrays.toString(stringArray));

        //String[] stringArray = names.toArray(new String[3]);
        String[] anotherStringArray = names.toArray(new String[names.size()]); // sames as line 24
        System.out.println(Arrays.toString(anotherStringArray));

        String[] petsArray = {"dog", "cat", "parrot"};
        List<String> petsList = Arrays.asList(petsArray); // this returns a fixed size list,
        // the above links petsArray with petsList, so whatever change that occurs in petsList (e.g. set new value)
        // will reflect on petsArray


        //petsList.add("horse"); this won't compile, you cannot add elements to the this list
        // petsList.remove(1); this won't compile, you cannot remove elements from the this list
        System.out.println(petsList);
        System.out.println(petsList.size());
        System.out.println(petsList.get(0));

        for(int i = 0; i < petsList.size(); i++){
            System.out.print(petsList.get(i) + " ");
        }

        System.out.println();
        petsList.set(0, "bird");
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray)); // this confirms what was said in lines 30-31

        petsList.set(2, "shark");
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray)); // this confirms what was said in lines 30-31

        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(list);
//        list.add("four");
//        System.out.println(list);
    }
}
