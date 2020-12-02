package mdc.polymorphism;

public interface Herbivore {
    default void eatPlants() {
        System.out.println("Eating plants");
    }
}
