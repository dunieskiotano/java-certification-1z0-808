package mdc.supervssuper;

public class Rabbit extends Animal{
    public Rabbit(){
        //super; does not compile
        //super().setAge(3);
        super();
        //this.setAge(3);
        //setAge(5);
    }

    //public Rabbit(int age, String name, double length){}
    public Rabbit(int age){
        //this();
        //this(age, "Dunieski", 3.4);
        super(3);

    }
}
