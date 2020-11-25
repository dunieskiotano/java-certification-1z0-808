package mdc.abstractmethods;

public class Snake extends Reptile{
    @Override
    protected boolean hasLegs() {
        return false;
    }
    @Override
    double getWeight() {
        return 10;
    }
}
