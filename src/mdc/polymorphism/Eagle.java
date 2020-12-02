package mdc.polymorphism;

public class Eagle extends Bird{
    public int fly(int height) {
        System.out.println("Eagle is flying at " + height + " meters");
        return height;
    }
}
