package mdc.methods;

public class Launcher {
    public static void main(String[] args) {
        String name = AnotherMain.printName("Carlos");
        System.out.println(name);
        //AnotherMain.printName("Carlos");
        System.out.println(AnotherMain.ssn);
        System.out.println(AnotherMain.grade);
        System.out.println(AnotherMain.grade2);
        System.out.println(AnotherMain.getPrivateString());

        System.out.println(AnotherMain.printName("Carlos"));
        StaticMethodsAndFields.main(args);
        System.out.println(StaticMethodsAndFields.myNumber);
        System.out.println(StaticMethodsAndFields.myNumber2);
        System.out.println(StaticMethodsAndFields.myNumber3);

        AnotherMain.main(args);
    }
}
