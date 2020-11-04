package mdc.arrays;

import java.util.Arrays;

public class VariableArguments {
//    public static void main(String[] args) {
//        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));
//    }
// Vararg Parameter
    public static void main(String... args){
        System.out.println(args.length);
// Vararg parameters are always the last in the list
        print(5);
        print(5, args);
        print(7, "Java");
        print(8, "This", "is", "my", "string", "array");
        print(9, "variable", "arguments", "are", "a", "nice", "and", "useful", "feature");
    }
    private static void print(int num, String... myArguments){
        System.out.println(Arrays.toString(myArguments));
        System.out.println(num);
    }
}
