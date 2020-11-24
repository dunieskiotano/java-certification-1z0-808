package mdc.inheritance2;

public class Animal {
    private int age;
    private String name;

    public Animal(int age) {
        System.out.println("Animal");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printDetails() {
        System.out.println("name = " + name + ", age = " + age);
    }

}
