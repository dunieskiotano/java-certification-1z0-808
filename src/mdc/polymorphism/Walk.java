package mdc.polymorphism;

public interface Walk {
    default int getSpeed() {
        return 5;
    }
}
