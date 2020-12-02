package mdc.polymorphism;

public class Snake extends Reptile{
    @Override
    protected boolean hasLegs() {
        return false;
    }

    @Override
    public double getWeight() {
        return 10;
    }
}
