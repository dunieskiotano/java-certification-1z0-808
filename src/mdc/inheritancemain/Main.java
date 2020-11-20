package mdc.inheritancemain;

import mdc.inheritance2.Dog;
import mdc.inheritance2.Husky;

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Husky");
        husky.printDetails();
        husky.setName("Carlos");
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();
    }
}
