package mdc.learningjava;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            //System.out.println("i = " + i);
            System.out.print(i + " "); // returns 0 1 2 3 4 5 6 7 8 9
        }
        System.out.println(); // prints a new ling sign

        int a;
        for (a = 0; a< 10; a++){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("after for loop a = " + a);

//        for(;;){
//            System.out.println("Hello");
//            //break;
//        }  prints an endless or infinite loop

        int x = 0;
        for(int y = 0, z = 4; x < 5 && y < 10; x++, y++){
            System.out.println("y = " + y);
        }
        System.out.println("x = " + x);

        for ( long z = 0; z < 10; z++){ }
        for (double xy = 0.0; xy < 10.5; xy += 0.5){}

        //for (long z = 0, int d = 4; z < 10; z++, d++){} => this will not compile

    }
}
