package mdc.polymorphism;
import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args) {
       Husky husky = new Husky(5);
        husky.setName("Rex");
        husky.printDetails();
        System.out.println("tail length = " + husky.getTailLength());

        Dog dog = husky; // UpCasting => another reference to the Husky object in memory
        dog.printDetails();

        HasTail hasTail = husky; // UpCasting => another reference to the Husky object in memory
        System.out.println("tail length = " + hasTail.getTailLength());

        CanRun canRun = husky; // UpCasting -> another reference to the Husky object in memory
        canRun.run(5);

        Animal animal = husky; // UpCasting => another reference to the Husky object in memory
        animal.printDetails();

        Object object = husky; // UpCasting => another reference to the Husky object in memory

        Husky myDog = (Husky)animal;  // UpCasting ==> another reference to the Husky object in memory
        myDog.printName();

        Animal cat = new Cat(2); // DownCasting
        cat.printDetails();
        Cat myCat = (Cat)cat; //another reference to the Cat object in memory

        Bird bird = new Bird();
        Object birdObject = bird; // UpCasting

        Eagle eagle = new Eagle();
        Bird eagleBird = eagle;// UpCasting
        Object eagleObject = eagle; // UpCasting

        List<String> list = new ArrayList<>();
        Animal rabbitAnimal = new Rabbit();
        rabbitAnimal.printDetails();

        Animal bear = new Bear(); // UpCasting
        bear.eat();
        // upper <--------------lower => UpCasting
        Omnivore omnivore = new Bear();// upcasting
        omnivore.eatMeat();

        Bear bear2 = new Bear();
        Animal bear3 = new Bear();// UpCasting
        // lower <-------------- upper => DownCasting
        Bear bear4 = (Bear)bear3; // DownCasting
        bear4.eatMeat();
    }
}
