package mdc.operators;

public class EqualityOperators {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        boolean c = a == b; // false
        boolean d = a != b; // true => (!) -> not equal

        System.out.println();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // boolean g = true == 0; => this does not compile, cannot compare boolean with int
        // boolean h = false != "test"; --> this does not compile, cannot compare boolean with String

        boolean x = true;
        boolean y = false;
        boolean z = (y = true) && (x = false);

        System.out.println();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("*********************************");
        boolean x1 = true;
        boolean y1 = false;
        boolean z1 = (y1 = true) || (x1 = false);

        System.out.println();
        System.out.println("x = " + x1);
        System.out.println("y = " + y1);
        System.out.println("z = " + z1);
    }
}
