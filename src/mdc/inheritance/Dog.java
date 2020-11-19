package mdc.inheritance;

public class Dog extends Animal{

    public Dog(int age){
        super(age);
        System.out.println("Dog");
        System.out.println("Dog is " + age + " years old");
    }

    public void print() {
        super.print();
        System.out.println("Hello from Dog");
        System.out.println("Dog's age is " + age + " years old");
    }
}
