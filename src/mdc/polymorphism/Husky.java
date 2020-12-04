package mdc.polymorphism;

public class Husky extends Dog{
    public Husky(int age) {
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
        System.out.println("Husky eating");
        super.eat();
    }

    @Override
    public int getWeight() {
        return 30;
    }

    @Override
    public int getTailLength() {
        return 20;
    }

    @Override
    public void run(int speed) {
        System.out.println("Husky running at speed= " + speed);
    }

    @Override
    public void printName() {
        System.out.println("Husky name= " + getName());
    }
}
