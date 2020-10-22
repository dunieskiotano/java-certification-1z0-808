package mdc.learningjava;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {

        int x = 2;
        int z = 3;

        System.out.println();
        x = x * z; // simple assignment
        System.out.println("x = " + x);
        x *= z; //  ==> shorter form of x = x * z
        System.out.println("x = " + x);
        // x += z; => the same as x = x + z;
        // x -= z; => the same as x = x - z;
       // x /= z; =>  the same as x = x / z;
        //x %= z; => the same as x = x % z;

        x *= z + 10;
        System.out.println("x = " + x);

        // int a += 5; this does not compile

        // without any explicit cast
        long a = 10;
        int b = 4;

        // b = b * a; this does not compile
        // b = (int)a * b; this compiles as well as b = (int)(a * b)

        b *= a; // the same as b = (int)a * b or b = (int)(a * b)
        System.out.println();
        System.out.println("b = " + b);

        long c = 4;
        long d = ( c = 2); // shorter form of c = 2; long d = c

        System.out.println("c = " + c + ", d = " + d);


        long e = 3;
        long f = 2;
        long h = 1;

        long i = e + 3 * (f = 3) - (h -= 2);
        // f = 3
        // e + 3 * 3 - (-1) -> h -= 2 -> also sets h = -1 // h = h - 2
        // e + 3 * 3 + 1
        // 3 + 3 * 3 + 1
        // 13

        System.out.println();
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("h = " + h);
        System.out.println("i = " + i);


    }
}
