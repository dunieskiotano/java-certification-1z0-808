package mdc.overridingvsoverloading;

public class Reptile {
    protected boolean hasLegs(){
        return true;
    }
    double getWeight(){
        return 2.0;
    }

    public void crawl(){
        System.out.println("Reptiles can crawl");
    }
}
