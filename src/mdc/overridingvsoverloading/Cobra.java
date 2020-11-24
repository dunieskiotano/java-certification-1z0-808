package mdc.overridingvsoverloading;

public class Cobra extends Snake {
    @Override
    public void crawl() {
        super.crawl();
        System.out.println("Cobras can dance. How about that? Simply eat your heart out!!!");
    }
}
