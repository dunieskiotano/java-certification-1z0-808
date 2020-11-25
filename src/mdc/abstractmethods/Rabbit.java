package mdc.abstractmethods;

public class Rabbit extends Animal{
    public Rabbit(){
        super();
    }
    public Rabbit(int age){
        super(3);
    }
    @Override
    protected void printName(){}
    @Override
    public int getWeight() {
        return 2;
    }
}
