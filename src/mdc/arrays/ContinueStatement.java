package mdc.arrays;

import java.util.Arrays;

public class ContinueStatement {
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        System.out.println("Printing array:");
        System.out.println(Arrays.toString(animals)); // => [Dog, Cat, Lizard, Bird, Snake]
        for (String animal: animals){
            System.out.println(animal);
        }
        System.out.println("****************************");

        System.out.println("Print everything but Cat");

        MY_LOOP:
        for(String animal: animals){
            if(animal.equals("Cat")){
                continue MY_LOOP;
            }
            System.out.println(animal);
        }
        System.out.println("****************************");

        System.out.println("Printing everything but Cat");
        animal:
        for(String animal: animals){
            if(animal.equals("Cat")){
                continue animal;
            }
            System.out.println(animal);
        }
        System.out.println("****************************");
        System.out.println("Printing everything but Lizard and Cat");
        for(String animal: animals){
            if(animal.equals("Lizard") || animal.equals("Cat")){
                continue;
            }
            System.out.println(animal);
        }
        System.out.println("****************************");

        int index = 0;
        while(index < animals.length){
            String animal = animals[index];
            index++;

            if(animal.equals("Lizard")){
                continue;
            }

            System.out.println(animal);
        }
    }
}
