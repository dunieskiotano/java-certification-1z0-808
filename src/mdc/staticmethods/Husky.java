package mdc.staticmethods;

public class Husky extends Dog{
    public Husky(int age){
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
        System.out.println("Husky is running at " + speed + " miles per hour.");
    }

    @Override
    protected void printName() {
        System.out.println("Husky name = " + getName());
    }
}
