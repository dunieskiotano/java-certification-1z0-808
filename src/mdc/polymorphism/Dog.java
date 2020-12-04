package mdc.polymorphism;

public abstract class Dog extends Animal implements HasTail, CanRun{
    public Dog(int age) {
        super(age);
        System.out.println("Dog");
    }

    @Override
    public int getTailLength() {
        return 5;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
    }

    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }
}
