package mdc.classdesign;

public class OrderOfInitialization {
    private String name = "dog";
    // second block to execute
    {
        System.out.println(name);
    }
    // first block to execute => static
    private static int COUNT = 0;
    static
    {
        System.out.println(COUNT);
    }
    // third block to execute
    {
        COUNT += 10;
        System.out.println(COUNT);
    }

    // last block to execute
    public OrderOfInitialization(){
        System.out.println("constructor");
    }
}

class Demo {
    // first block to execute
    static {
        add(2);
    }

    static void add(int number) {
        System.out.println(number + " ");
    }

    // fifth block to execute
    Demo() {
        add(5);
    }

    // second block to execute
    static {
        add(4);
    }

    // third block to execute
    // sixth block to execute again
    {
        add(6);
    }

    static {
        new Demo();
    }


    // fourth block to execute
    {
        add(8);
    }
}

    class Test{
        public static void main(String[] args) {
            new OrderOfInitialization();
            new Demo();
        }
    }

