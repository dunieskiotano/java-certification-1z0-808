package mdc.inheritance;

public class Animal {
    public int age;
    public Animal(int age){
       System.out.println("Animal");
       this.age = age;
       System.out.println("Animal is " + age + " years old");
   }
    public void print(){
        System.out.println("Hello from Animal");
    }
}
