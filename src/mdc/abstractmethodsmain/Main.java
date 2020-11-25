package mdc.abstractmethodsmain;

import mdc.abstractmethods.Husky;

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Rex");
        husky.printDetails();
        husky.setAge(6);
        husky.printDetails();
        System.out.println("weight = " + husky.getWeight());

        husky.eat();
        System.out.println("avg = " + husky.getAverageWeight());
    }
}
