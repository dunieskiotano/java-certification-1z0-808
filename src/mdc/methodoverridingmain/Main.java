package mdc.methodoverridingmain;

import mdc.methodoverriding.Cat;
import mdc.methodoverriding.Dog;
import mdc.methodoverriding.Husky;

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Google");
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();

        husky.eat();
        System.out.println("avg = " + husky.getAverageWeight());

        husky.setAge(100);
        husky.setName("Microsoft");
        husky.printDetails();
        dog.printDetails();

        Cat cat = new Cat(76);
        cat.setName("Misu");
        cat.printDetails();
    }
}
