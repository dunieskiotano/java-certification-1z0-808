package mdc.supervssupermain;

import mdc.supervssuper.Dog;
import mdc.supervssuper.Husky;

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Apolo");
        husky.printDetails();


        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();
        husky.eat();
        System.out.println("avg = " + husky.getAverageWeight());
    }
}
