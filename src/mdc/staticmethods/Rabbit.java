package mdc.staticmethods;

public class Rabbit extends Animal implements Herbivore, Hop {
    public Rabbit(){
        super();
    }
    public Rabbit(int age){
        super(3);
    }

    @Override
    public void printDetails() {
        System.out.println("Rabbit average jump height is " + Hop.getAverageJumpHeight());
    }

    @Override
    public int getWeight() {
        return 2;
    }

    @Override
    protected void printName() {}


}
