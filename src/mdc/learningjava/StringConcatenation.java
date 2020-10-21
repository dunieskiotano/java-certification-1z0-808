package mdc.learningjava;

public class StringConcatenation {
    public static void main(String[] args) {
        String text = "hello";
        String anotherText = new String("hello");

        System.out.println(2 + 3); // 5
        System.out.println("a" + "b");// ab
        System.out.println(1 + 2 + "d"); // 3d
        System.out.println("d" + 1 + 2);// d12
        System.out.println("d" + (1 + 2));// d3

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64
        System.out.println(four + 1 + 2 + three); // 4123

        int number = 10;
        int anotherNumber = 20;
        System.out.println("result = " + number + anotherNumber); // result =  1020
        System.out.println("result = " + (number + anotherNumber)); // result = 30

        String str = " ";
        for(int i = 0; i < 10; i++){
            str += i + " ";
        }
        System.out.println("str = " + str);

        String hello = "hello";
        String world = "world";
        String helloWorld = hello + world;
        System.out.println("helloWorld = "  + helloWorld); // helloworld
        System.out.println("hello = " + hello); // hello
    }
}
