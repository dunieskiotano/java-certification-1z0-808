package mdc.methods;

import java.util.Arrays;

public class MethodsWithVarArgs {
    public static void main(String[] args) {
        jump1();
        jump1(11);
        jump1(1, 3, 4);
        jump1(3, 5, 7, 8, 9);

        jump2("Cool", 2, 3, 4, 5, 6);
        jump2("Dunieski", 4, 2, 3, 4);

        System.out.println();
        String name = jump5(new int[]{1,2, 3, 4}, new String[]{"Dunieski", "Orlando"});
        System.out.println();
        System.out.println("My full name is " + name);
        System.out.println("My full name is " + jump5(new int[]{1,2, 3, 4}, new String[]{"Dunieski", "Orlando"}));
    }
    public static void jump1(int... numbers){
        System.out.println(Arrays.toString(numbers));
    }
    public static void jump2(String text, int start, int... numbers){
        System.out.println("This is so " + text);
        System.out.println("start = " + start);
        System.out.println(Arrays.toString(numbers));
        for(int number: numbers)
            System.out.print(number + " ");
    }
    //public static void jump3(int... numbers, int start){} => this does not work because varargs cannot be the first
    // in this list
    //public static void jump4(int... start, int... numbers){} => this does not work either because varargs cannot be the first
    // in this list

    public static String jump5(int[] numbers, String[] texts){
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        for(int num : numbers)
            System.out.print(num + " ");
        System.out.println();
        System.out.print(Arrays.toString(texts));
        System.out.println();
        for(String text : texts)
        System.out.print(text + " ");
        String text1 = "Dunieski";
        String text2 = " Otano";
        return text1 + text2;
    }
}
