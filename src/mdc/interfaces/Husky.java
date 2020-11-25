package mdc.interfaces;

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
    protected void printName() {
        System.out.println("Husky's name is " + getName());
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
        System.out.println("Husky is running at speed " + speed + " miles per hour");
    }
}
