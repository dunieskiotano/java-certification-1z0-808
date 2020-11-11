package mdc.arrays;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        ArrayList<Object> myList2 = new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(); // uses the diamond operator
        List<String> list3 = new ArrayList<>(); // uses the List interface

        //ArrayList<String> list4 = new List<String>(); That does not compile

        List<String> list5 = new ArrayList<>(20);
        System.out.println(list5.size());
        list5.add("Name");
        System.out.println(list5.size());
        list5.add("Last Name");
        System.out.println(list5.size());
        list5.remove(1);
        System.out.println(list5.size());

        myList2.add("Dunieski");
        myList2.add(4);
        System.out.println(myList2);

    }
}
