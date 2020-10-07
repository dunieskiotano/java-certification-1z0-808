package mdc.learningjava;

import com.anotherpackage.Animal;

import static java.lang.Math.*;
import static java.lang.System.out;

public class StaticImportsExample {
    public static void main(String[] args) {
        int max = max(5,7); // gets min number
        int min = min(5,7); // gets max number
        out.println("The smallest number is " + min + " and the biggest number is " + max);
        out.println(PI);

        Animal animal = new Animal(); // instantiate an object from Animal Class
        animal.printResult(); // invoke class Animal printResult method from Animal class



    }
}
