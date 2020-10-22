package mdc.primitives;

public class WholeNumericPrimitives {
    public static void main(String[] args) {
        long max = 32_123_456_789L;
        long n = 2_300;

        // octal (0-7)
        int oct = 07; // returns 7 decimal
        int firstOct= 010; // returns 8 decimal
        int secondOct = 022; // returns 18 decimal
        int thirdOct = 032;

        int sumOct = firstOct + secondOct;

        System.out.println("first = " + firstOct + " second = " + secondOct);
        // let's convert decimal to octal using method toOctalString() and pass the sumOct value
        System.out.println("decimal sum = " + sumOct + " octSum = " + Integer.toOctalString(sumOct));
        System.out.println(thirdOct);

        //System.out.println(oct);
        //System.out.println(firstOct);
        //System.out.println(secondOct);

        // hexadecimal (0-9 and A-F)
        int firstHex = 0xF; // returns 15 decimal
        int secondHex = 0x1E; // returns 30 decimal
        //char a = 101;
        int sumHex = firstHex + secondHex;

        System.out.println("first = " + firstHex + " second  = " + secondHex);
        // let's convert decimal to hexadecimal using method toHexString() and pass the sumHex value
        System.out.println("decimal sum = " + sumHex + " hexSum = " + Integer.toHexString(sumHex) );

        //System.out.println(a);

        //binary
        int firstBin = 0b1001; // returns 9 decimal
        int secondBin = 0b0111; // returns 7 decimal

        int sumBin = firstBin + secondBin; // returns 16

        System.out.println("first = " + firstBin + " second = " + secondBin);
        // let's convert decimal to binary using method toBinaryString() and pass the sumBin value
        System.out.println("decimalSum = " + sumBin + " binSum = " + Integer.toBinaryString(sumBin)); // returns 9 + 7 = 16, and 10000 in binary

        // int thirdBin = 0b2; => this does not compile





    }
}
