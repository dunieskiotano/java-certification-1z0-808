package mdc.abstractclasses;

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
}
