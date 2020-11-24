package mdc.methodoverriding;

public class Dog extends Animal{
    public Dog(int age){
        super(age);
        System.out.println("Dog");
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
