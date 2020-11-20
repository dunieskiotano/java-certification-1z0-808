package mdc.overridingvsoverloadingmain;

import mdc.overridingvsoverloading.Cobra;
import mdc.overridingvsoverloading.Dog;
import mdc.overridingvsoverloading.Husky;

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.printDetails();

        Dog dog = new Dog(3);
        dog.setName("Rex");
        dog.printDetails();

        husky.eat();
        System.out.println("avg = " + husky.getAverageWeight());

        Cobra cobra = new Cobra();
        cobra.crawl();



    }
}
