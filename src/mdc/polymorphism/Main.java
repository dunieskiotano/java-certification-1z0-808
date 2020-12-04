package mdc.polymorphism;

import mdc.staticmethods.Bear;
import mdc.staticmethods.Cat;
import mdc.staticmethods.Hop;
import mdc.staticmethods.Husky;
import mdc.staticmethods.Rabbit;

public class Main {
    public static void main(String[] args) {
        mdc.staticmethods.Husky husky = new Husky(5);
        husky.setName("Rex");
        husky.printDetails();
        husky.setAge(6);
        //husky.setName("Jimmy");
        husky.printDetails();
        husky.run(10);
        int tailLength = husky.getTailLength();
        System.out.println("tail length = " + tailLength);
        System.out.println("tail length = " + husky.getTailLength());

        System.out.println("weight = " + husky.getAverageWeight());
        husky.eat();


        mdc.staticmethods.Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setAge(10);
        bear.eatMeat();
        bear.eatPlants();
        bear.printDetails();

        mdc.staticmethods.Rabbit rabbit = new Rabbit();
        rabbit.eatPlants();
        rabbit.printDetails();
        int jumpHeight = mdc.staticmethods.Hop.getAverageJumpHeight();
        System.out.println("Jump Height = " + jumpHeight);
        System.out.println("Jump Height = " + Hop.getAverageJumpHeight());

        mdc.staticmethods.Cat cat = new Cat(3);
        cat.setName("Misu");
        cat.printDetails();
        int speed = cat.getSpeed();
        System.out.println("cat's speed is " + speed + " miles per hour");
        System.out.println("cat's speed is " + cat.getSpeed() + " miles per hour");
    }
}
