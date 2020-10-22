package mdc.learningjava;

public class VariableScope {

    static int myNewInt = 5;


    public static void main(String[] args){
        int myLocalInt = 10;
        {
            {
                int myOtherInt = 10;
                {
                    int myOtherInt2 = 20;
                    System.out.println(myOtherInt2);
                }
                System.out.println(myOtherInt);
                // System.out.println(myOtherInt2); ==> this does not compile, myOtherInt2 is out of scope

            }
            // System.out.println(myOtherInt); ==> this does not compile, myOtherInt is out of scope
            int myOtherInt = 20;
            int anotherInt = 30;
            System.out.println("myOtherInt = " + myOtherInt);
            System.out.println("inCodeBlock myLocalInt = " + myLocalInt);
            System.out.println("anotherInt = " + anotherInt);
        }

        System.out.println("myLocalInt = " + myLocalInt);
        System.out.println("MyNewInt = " + myNewInt);
        printMyNewInt();
        printMyNewInt1();
        printMyNewInt2();

    }

    public static void printMyNewInt(){
        System.out.println("Accessing myNewInt = " + myNewInt + " from printMyNewInt() method");

    }
    public static void printMyNewInt1(){
        System.out.println("Accessing myNewInt = " + myNewInt + " from printMyNewInt() method");

    }
    public static void printMyNewInt2(){
        System.out.println("Accessing myNewInt = " + myNewInt + " from printMyNewInt() method");

    }
}
