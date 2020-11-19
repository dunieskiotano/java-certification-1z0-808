package mdc.methods;

public class DogTester {
    public static void main(String[] args) {
        Dog husky = new Dog();
        System.out.println(husky.count); // 0
        System.out.println(Dog.count); // 0

        Dog anotherDog = new Dog();
        anotherDog.incrementCounter(); // 2
        Dog.incrementCounter(); // 3
        System.out.println(Dog.count);
        Dog.incrementCounter();
        System.out.println(Dog.count);

        husky = null;
        anotherDog = null;

        System.out.println(Dog.count); // 3
        System.out.println(husky.count); // 3
        System.out.println(anotherDog.count); // 3


        Dog oneMoreDog = new Dog();
        System.out.println(oneMoreDog.count);

        Dog.count = 10;
        System.out.println(Dog.count); // 10
        Dog newDog = new Dog();
        Dog dog2 = new Dog();
        newDog.count = 5;


        System.out.println(Dog.count); // 5
        System.out.println(newDog.count); // 5
        System.out.println(dog2.count); // 5

        dog2.count = 25;

        System.out.println(husky.count); // 25
        System.out.println(newDog.count); // 25
        System.out.println(dog2.count); // 25
        System.out.println(oneMoreDog.count); // 25
        System.out.println(anotherDog.count); // 25
    }
}
