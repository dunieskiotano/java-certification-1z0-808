package mdc.classdesign;

public class Dog {
    private String color;

    public Dog(String color) {
        System.out.println("constructor");
        this.color = color;
    }
//    public Dog() {
//        System.out.println("constructor with no arguments");
//    }
//    public Dog(int num, int... numbers) {
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(num);
//    }
//
//    Dog dog = new Dog("red");
//    Dog dog1 = new Dog();
//    Dog dog2 = new Dog(1, 3, 4, 5, 6);

    public void printColor(){
        System.out.println("color = " + this.color);
    }
}

class Cat{
    // Encapsulation
    private String color;
    private int height;
    private int length;

    public Cat(int length, int theHeight){
        this.length = length;
        height = theHeight;
        color = "white";
    }
    public void printInfo(){
        System.out.println("Cat length = " + this.length + " height = " + height + " color = " + color);
    }
}

class ClassConstructors{
    public static void main(String[] args) {
        Dog dog = new Dog("gray");
        Cat cat = new Cat(23, 45);
        cat.printInfo();
        dog.printColor();
    }
}
