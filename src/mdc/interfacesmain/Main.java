package mdc.interfacesmain;

import mdc.interfaces.Bear;
import mdc.interfaces.Cat;
import mdc.interfaces.Husky;
import mdc.interfaces.Rabbit;

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Rex");
        husky.printDetails();
        husky.setAge(6);
        husky.printDetails();
        husky.run(10);
        System.out.println("tail length = " + husky.getTailLength());
        System.out.println("weight = " + husky.getWeight());

        husky.eat();
        System.out.println("avg = " + husky.getAverageWeight());

        Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setAge(10);
        bear.eatMeat();
        bear.eatPlants();
        bear.printDetails();

        Rabbit rabbit = new Rabbit();
        rabbit.eatPlants();

        Cat cat = new Cat(3);
        System.out.println("The cat's speed is " + cat.getSpeed() + " miles per hour - 1");
        String text = cat.printText("Hello from the 'Run' Interface 1");
        System.out.println(text);
        System.out.println(cat.printText("Hello from the 'Run' Interface 2"));
        int speed = cat.getSpeed();
        System.out.println("The cat's speed is " + speed + " miles per hour - 2");


    }
}
