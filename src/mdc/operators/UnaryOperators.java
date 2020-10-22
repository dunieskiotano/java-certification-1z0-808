package mdc.operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int x = + 3;// + is redundant
        int x1 = 3;
        System.out.println("x = " + x + ", x1 = " + x1);

        double y = - x;
        System.out.println("x = " + x + ", y = " + y); // returns x = 3, y = -3.0

        int myNumber = 12;
        double myOtherNumber = myNumber;

        System.out.println(myOtherNumber); // returns 12.0

        y = - y; // -1 * y => -1 * (-3) => 3.0 since y is a double
        System.out.println("x = " + x + ", y = " + y);

        boolean a = true;
        boolean b = !a;
        System.out.println("a = " + a + ", b = " + b);

        // ! value => the opposite of value => !true => false, and !false => true
        System.out.println(!false); // returns true
        System.out.println(!!false); // returns false
        System.out.println(!!!false); // returns true
        System.out.println(!!!!!!!!!!!!!!!!!true);

        //int myInt = !5; this does not compile
        //boolean myBoolean = - true; this does not compile
        // boolean z = !0; this does not compile either

        // increment and decrement - be careful, have higher precedence order than (+, -, *, /, .....)
        int myInt = 5;
        myInt = myInt + 1; // returns 6
        //int otherInt = myInt;
        System.out.println(myInt);
        //System.out.println(otherInt);

        int otherInt = myInt++; // myInt becomes 7, use and then increment
        System.out.println("myInt = " + myInt + ", otherInt = " + otherInt); // this returns myInt = 7, otherInt = 6

        int count = 0;
        System.out.println(count); // 0
        System.out.println(++count);// 1, count was 0 and becomes 1
        System.out.println(count); // 1
        System.out.println(count--); // 1 but count becomes 0
        System.out.println(count); // 0
        System.out.println(count--);
        System.out.println(count);
        System.out.println(count++);
        System.out.println(count);
        System.out.println(++count);
        System.out.println(count);

        // exam questions
        int e = 3;
        int f = ++e * 5 / e-- + --e;
        // e = 3
        // 4 * 5 / e-- + --e => ++e => ++3 => e = 4
        // 4 * 5 / 4 + --e; => e = 3  => e-- => 4-- -> 3
        // 4 * 5 / 4 + 2; => --3 => e = 2
        // 20 / 4 + 2
        // 5 + 2
        // 7

        System.out.println("e = " + e + ", f = " + f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        // h = 3  g = 6
        // 3 + --g * 3 + 2 * g++ -  h-- % --g
        // h = 3, g = 5
        // 3 + 5 * 3 + 2 * g++ - h-- % --g
        // 3 + 5 * 3 + 2 * 5 - h-- % --g
        // h = 2, g = 6
        // 3 + 5 * 3 + 2 * 5 - 3 % 5
        // g = 5
        // 3 + 15 + 10 - 3
        // 18 + 10 - 3
        // 28 - 5
        // i = 25
        System.out.println("g = " + g + ", h = " + h + ", i = " + i); // returns g = 5, h = 2, i = 25

    }
}
