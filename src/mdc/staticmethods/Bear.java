package mdc.staticmethods;

public class Bear extends Animal implements Omnivore {
    @Override
    public void eatPlants() {
        System.out.println("Bear eating plants");
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear eating meat");
    }

    @Override
    public int getWeight() {
        return 2000;
    }

    @Override
    protected void printName() {
        System.out.println("Smokey The Bear");
    }
}
