package mdc.abstractclassmain;

import mdc.abstractclasses.Dog;
import mdc.abstractclasses.Husky;

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Jimmy");
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();

        husky.eat();
        System.out.println("avg = " + husky.getAverageWeight());

    }
}
