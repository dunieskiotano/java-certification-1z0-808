package mdc.inheritance;

public class Husky extends Dog{
    public Husky(int age){
        super(age);
        System.out.println("Husky");
        System.out.println("Husky is " + age +" years old");
    }

    public void print() {
        super.print();
        System.out.println("Hello from Husky");
        System.out.println("Husky's age is " + age + " years old");
    }
}
