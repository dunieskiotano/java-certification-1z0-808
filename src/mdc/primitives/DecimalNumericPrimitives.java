package mdc.primitives;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {

        float myNumber = 25.4F;

        //double before = 10_.25; => this does not compile
        //double after = 10._25; => this does not compile
        //double first = _10.25; => this does not compile
       // double last = 10.25_; => this does not compile;

        double myDouble = 2.54; // => this does compile
        // double myDouble = 2.54D; => this does compile but the letter D is optional
        double myDouble2 = 2.54F; // => this does compile
        double myDouble3 = 3; // => this does compile

        System.out.println(myDouble3);

        double scientific = 5.000125E03; // => this does compile
        double scientific2 = 5.000125E3; // => this does compile
        double scientific3 = 5000.125; // => this does compile

        System.out.println("scientific = " + scientific); // => returns scientific = 5000.125
        System.out.println("scientific2 = " + scientific2); // => returns scientific = 5000.125
        System.out.println("scientific3 = " + scientific3); // => returns scientific = 5000.125

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number
        System.out.println("hexPi = " + hexPi);
        System.out.println(Math.PI);
    }
}
