package mdc.elementsorder;

import mdc.objects.Animal;


public class OrderingElements {
    int myInt = 10;
    static String myString = "Dunieski";

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.printResult();
        //Animal.printResult(); // ==> this is used only if the method printResult() is declared static in the Animal class
        MyOtherClass myOtherClass = new MyOtherClass();
        int number = myOtherClass.printResult();
        // int number = MyOtherClass.printResult(); ==> this is used only if the method printResult() is declared static
        System.out.println("The number is " + number);

        int anotherInt = 20;
        String name = "Dunieski";

//        void mymethod(){ ==> this does not compile because myMethod() method is created inside the
                             // main method and methods cannot overlap
//
//        }

    }


    // PIC => (package, imports, class) => Remember this order
}
