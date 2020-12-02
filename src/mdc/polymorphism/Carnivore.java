package mdc.polymorphism;

public interface Carnivore {
    default void eatMeat() {
        System.out.println("Eating meat");
    }
}
