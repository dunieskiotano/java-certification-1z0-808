package mdc.learningjava;

public class ObjectEquality {

    public static void main(String[] args) {
        // comparing objects
        Integer myInteger = 127;
        Integer myAnotherInteger = 127;

        System.out.println();
        System.out.println(myInteger == myAnotherInteger); // true
        System.out.println(myInteger.equals(myAnotherInteger)); // true
        System.out.println();
        System.out.println("128 == 128:  " + (128 == 128)); // returns true
        System.out.println("myInteger hash: " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash: " + System.identityHashCode(myAnotherInteger));

        System.out.println();
        myInteger = 128;
        myAnotherInteger = 128;
        System.out.println("myInteger hash: " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash: " + System.identityHashCode(myAnotherInteger));
        System.out.println();
        myInteger = 126;
        myAnotherInteger = 126;
        System.out.println("myInteger hash: " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash: " + System.identityHashCode(myAnotherInteger));
        System.out.println();
        myInteger = 125;
        myAnotherInteger = 125;
        System.out.println("myInteger hash: " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash: " + System.identityHashCode(myAnotherInteger));
        System.out.println();
        myInteger = -128;
        myAnotherInteger = -128;
        System.out.println("myInteger hash: " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash: " + System.identityHashCode(myAnotherInteger));

        // if the values of an Integer object range from -128 to 127, they have the same hash code
        // and the same memory address. So the integer hash that is returned is the same for both numbers

        System.out.println();
        myInteger = 128;
        myAnotherInteger = 128;
        // == compares location in memory, whereas the equals() method compares the vales
        System.out.println(myInteger == myAnotherInteger); // returns false
        System.out.println(myInteger.equals(myAnotherInteger)); // this returns true

        System.out.println();
        myInteger = 126;
        myAnotherInteger = 126;
        // == compares location in memory, whereas the equals() method compares the values
        System.out.println(myInteger == myAnotherInteger); // returns true
        System.out.println(myInteger.equals(myAnotherInteger)); // this returns true

        //myInteger = 125;  => this is the same as line 57
        //Integer.valueOf(125); => this is the same as line 56

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;
        Integer int4 = 1;

        System.out.println();
        System.out.println("int1 == int2 = " + (int1 == int2));
        System.out.println("int1 == int3 = " + (int1 == int3));
        System.out.println("int2 == int3 = " + (int2 == int3));



        System.out.println();
        System.out.println("int1.equals(int2) = " +int1.equals(int2));
        System.out.println("int1.equals(int3) = " +int1.equals(int3));
        System.out.println("int2.equals(int3) = " +int2.equals(int3));

        System.out.println();
        System.out.println("int1 hash: " + System.identityHashCode(int1));
        System.out.println("int2 hash: " + System.identityHashCode(int2));
        System.out.println("int3 hash: " + System.identityHashCode(int3));
        System.out.println("int4 hash: " + System.identityHashCode(int4));


    }
}
