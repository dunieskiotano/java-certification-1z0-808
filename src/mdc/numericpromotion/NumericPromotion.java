package mdc.numericpromotion;

public class NumericPromotion {

    public static void main(String[] args) {
        // promotion is converting "smaller" to "bigger" type

        int x = 5;
        double y = 10.55;

        //System.out.println("x + y = " + x + y); // returns 510.55
         double result = x + y;
        System.out.println("x + y = " + (x + y));
        System.out.println("x + y = " + result);
        System.out.println(result);

        byte b = 10;
        int c = 5;
        double d = 4.5;

        result = b + c + d;
        System.out.println("result = " + result);

        // casting is converting "bigger" to "smaller" type
        double myDouble = 5.55;
        int myInt = 4 + (int)myDouble;
        // System.out.println("result = " +(int)myDouble); returns 5
        System.out.println("result = " + myInt); // returns 9

        int anotherInt = 125;
        byte myByte = 15; // byte goes from -128 to 127 => 1 byte => 8 bits
        // returns -116 because 140 is greater than 127

        int intResult = anotherInt + myByte; // promotion
        System.out.println(intResult);

        byte byteResult =  (byte)(anotherInt + myByte);
        System.out.println("byteResult = " + byteResult);





    }
}
