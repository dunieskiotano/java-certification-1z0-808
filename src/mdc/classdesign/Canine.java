package mdc.classdesign;

public class Canine {
    private String name;
    private String breed;
    private double weight;

    public Canine(String name) {
        this(name, "husky");
        System.out.println("constructor 1");
    }
    public Canine(String name, String breed) {
        this(name, breed, 30.0);
        System.out.println("constructor 2");
    }
    public Canine(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("constructor 3");
    }

    public void print() {
        System.out.println(name + " " + breed + " " + weight);
    }
}

class OverloadingConstructors{
    public static void main(String[] args) {
        Canine canine1 = new Canine("Jimmy");
        canine1.print();

        Canine canine2 = new Canine("Anthony", "shepherd");
        canine2.print();

        Canine canine3 = new Canine("Rex", "German shepherd", 40);
        canine3.print();
    }
}
