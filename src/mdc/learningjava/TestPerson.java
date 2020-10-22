package mdc.learningjava;

public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person(); // creates an object from Person class
        Person person2 = new Person(); // creates another object from Person class
        person1.setFirstName("Dunieski");
        person1.setLastName("Otano");
        person1.setAge(44);

        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());

        person2.setFirstName("Orlando");
        person2.setLastName("Otano");
        person2.setAge(37);

        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getAge());

    }
}