package mdc.interfaces;

public class Cat extends Animal implements Run{
    public Cat(int age){
        super(age);
    }

    @Override
    public int getWeight() {
        return 5;
    }

    @Override
    protected void printName(){};

    @Override
    public String printText(String text) {
        return text;
    }
}

