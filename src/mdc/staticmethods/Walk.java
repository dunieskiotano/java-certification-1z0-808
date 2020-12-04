package mdc.staticmethods;

public interface Walk {
    default int getSpeed(){
        return 5;
    }
}
