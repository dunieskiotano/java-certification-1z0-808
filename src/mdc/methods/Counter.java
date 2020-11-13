package mdc.methods;

public class Counter {
    public static int count;
    public int anotherCount;
    public static int oneMoreCount = 2;
    public static int andAnotherCount = 5;
    public static int andAnotherCountMore = 10;

    public Counter() {
        count++;
        anotherCount++;
        oneMoreCount++;
        andAnotherCount++;
        andAnotherCountMore++;
    }
    public static void main(String[] args) {
        Counter one = new Counter();
        Counter two = new Counter();
        Counter three = new Counter();
        Counter four = new Counter();

        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

        count++;
        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

        count--;

        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

        ++count;

        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);



        System.out.println(one.anotherCount);
        System.out.println(two.anotherCount);
        System.out.println(three.anotherCount);
        System.out.println(four.anotherCount);

        System.out.println(oneMoreCount);
        System.out.println(andAnotherCount);
        System.out.println(andAnotherCountMore); //

        one.anotherCount = 2;
        two.anotherCount = 3;
        three.anotherCount = 4;
        four.anotherCount = 5;
        System.out.println(one.anotherCount);
        System.out.println(two.anotherCount);
        System.out.println(three.anotherCount);
        System.out.println(four.anotherCount);
    }
}


