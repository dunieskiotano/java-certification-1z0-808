package mdc.learningjava;

public class ConditionalOperators {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b; // false => both need to be true for the entire operation to be true
        boolean e = a || b; // true => only one needs to be for the entire operation to be true

        System.out.println();
        System.out.println();
        System.out.println("d = " + d + ", e = " + e);

        System.out.println();
        int f = 4;
        boolean g = false && (++f < 4); // (++f < 4) is never executed = > short circuiting
        boolean h = (f-- == 4) && !g; // returns true f = 3

        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
        // (myInt <= 3 ) -> true
        // (anotherInt-- == 4) -> 4 == 4, another = 3

        System.out.println();
        System.out.println("myInt = " + myInt); // 3
        System.out.println("anotherInt = " + anotherInt); // 3
        System.out.println("myBoolean = " + myBoolean); // true

        boolean x = true,  z = true;
        //int num1 = 2, num2 = 4;
        int y = 20;
        x = (y != 10) ^ (z = false); // z = false, it sets z to false
        // ^ bitwise exclusive OR => for the entire expression to be true, one side has to be true and the other one
        // false


        System.out.println("x = " + x + ", y = " + y + ", z = " + z);


    }
}
