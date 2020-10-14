package mdc.learningjava;

// Integer => int
// Double => double
// Float => float

public class WrapperTypes {

    public static void main(String[] args) {
        int myInt = 10;
        Integer myInteger = 10;
        Integer myInteger2 = 20;
        Integer myInteger3 = Integer.valueOf(10);
        Integer myInteger4 = Integer.parseInt("3");
        Integer myInteger5 = null;
        //int myInt2 = null; => this does not compile

        //int num = Integer.parseInt("3"); => This is correct but commented out
        //System.out.println(num); => This is correct but commented out

        Integer myInteger6 = 20;
        Integer myInteger7 = Integer.valueOf(20);
        Integer myInteger8 = Integer.parseInt("20");

        System.out.println("myInteger = " + myInteger);
        System.out.println("myInteger2 = " + myInteger2);
        System.out.println("myInteger3 = " + myInteger3);
        System.out.println("myInteger4 = " + myInteger4);
        System.out.println("myInteger5 = " + myInteger5);

        System.out.println("*********** Three different ways, still same result ************");
        System.out.println("myInteger6 = " + myInteger6);
        System.out.println("myInteger7 = " + myInteger7);
        System.out.println("myInteger8 = " + myInteger8);

        //Scanner input = new Scanner(System.in);
        //System.out.print("What is your age >> ");
        //int num = Integer.parseInt(input.nextLine());
       // int age = input.nextInt();
        //if (age < 30)
          //  System.out.println("Wow, so young");
       // else
           // System.out.println("Still young");
        //System.out.println(num);

        // converting wrapper to primitive => unboxing
        int Int3 = myInteger3; // unboxing

        //int Int4 = myInteger5; => throw a null pointer exception, primitives cannot contain null

        // boxing => converting a primitive to a wrapper
        Integer myInteger9 = new Integer(10);
        Integer myInteger10 = myInt;



        int num1 = 1;
        int num2 = 5;
        printSum(num1, num2); // autoboxing
        printSum(myInteger, myInteger2);
    }

    private static void printSum(Integer first, Integer second){
        Integer sum = first + second;
        System.out.println("sum = " + sum);
    }

}
