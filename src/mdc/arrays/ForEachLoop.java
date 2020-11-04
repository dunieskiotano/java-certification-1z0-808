package mdc.arrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Jimmy", "John", "Tom", "Anthony"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("name = " + names[i]);
        }

        for (String name : names) {
            System.out.println("name = " + name);
        }
        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };
        StringBuilder[] builder1 = new StringBuilder[]{
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };
        StringBuilder[] builder3 = new StringBuilder[5];
        builder3[0] = new StringBuilder("For");
        builder3[1] = new StringBuilder("Loop");
        builder3[2] = new StringBuilder("And");
        builder3[3] = new StringBuilder("Arrays");
        builder3[4] = new StringBuilder("Strings");
        System.out.println("Builder 3 = " + Arrays.toString(builder3));


        StringBuilder builder2 = new StringBuilder();
        System.out.println("Size = " + builder2.length());
        System.out.println("Capacity = " + builder2.capacity());

        for (StringBuilder builder : builders) {
            System.out.println(builder);
        }

        String pets = "Parrot";
        for (char c : pets.toCharArray()) {
            System.out.println(c);
        }
        System.out.println(args.length);


    }

}
