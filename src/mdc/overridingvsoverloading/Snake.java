package mdc.overridingvsoverloading;

public class Snake extends Reptile {
    @Override
    protected boolean hasLegs() {
        return false;
    }
    @Override
    double getWeight() {
        return 10;
    }

    @Override
    public void crawl() {
        super.crawl();
        System.out.println("And snakes can too");
    }
}
