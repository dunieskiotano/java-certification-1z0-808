package mdc.interfaces;

public interface Carnivore {
    default void eatMeat(){
        System.out.println("Eating meat");
    }
}
