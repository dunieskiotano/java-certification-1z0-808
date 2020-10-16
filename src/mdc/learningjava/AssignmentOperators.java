package mdc.learningjava;

public class AssignmentOperators {

    public static void main(String[] args) {
        // int x = 1.0; => this does not compile
        // short y = 19812345; this does not compile
        // int z = 9L; this does not compile
        // long t = 2.4; this does not compile
        // long l = 123446785432344; this does not compile

        // casting => converting
        int x = (int) 1.0; // casting to an int
        short y = (short) 19812345; // casting to a short
        int z = (int) 9L;  // casting to an int
        long t = (long) 2.4;  // casting to an long
        long l = 123446785432344L;

        System.out.println();
        System.out.println();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("t = " + t);
        System.out.println("l = " + l);

        // byte goes from -128 to 127 => 150

        byte myByte = 125;
        byte myByte1 = 3;
        byte mySecondByte = -128;
        byte sum = (byte)(myByte + myByte1);
        System.out.println(sum);

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);


        myByte++; // => myByte = myByte + 1

        --mySecondByte; // => myByte = myByte - 1

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

        short a = 10;
        short b = 20;
        short c = (short)(a * b);
        System.out.println("c = " + c);
    }
}
