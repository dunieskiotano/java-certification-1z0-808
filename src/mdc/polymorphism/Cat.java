package mdc.polymorphism;

public class Cat extends Animal {
    public Cat(int age) {
        super(age);
    }

    @Override
    public int getWeight() {
        return 5;
    }

    @Override
    public void printName() {

    }
}
