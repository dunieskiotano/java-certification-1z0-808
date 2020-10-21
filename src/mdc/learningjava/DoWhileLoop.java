package mdc.learningjava;

public class DoWhileLoop {
    public static void main(String[] args) {
        int a = 0;

        // do {write code here} while(boolean expression);
        do {
            a++;
        } while (false);

        System.out.println("a = " + a);

        //while(false){} this will not compile

        int x = 20;
        while (x > 10) {x--; System.out.println(x);}
        System.out.println("x = " + x);

        int x2 = 20;
        do {x2--; System.out.println(x2);}
        while(x2 > 10);

        System.out.println("x2 = " + x2);

        int y = 10;
        int z = 5;
        while(y < 20){
            y++;
        }
        // y = 20
        z +=2; // => 5 + 2 => z = 7
        y += 10; // => y = y + 10 => 20 + 10 => y = 30
       // y = 30
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

        int number = 10;
        while( number > 10){
            number--;
        }
        do{
            number--;
            // number = 9
            while (number > 5){
                number -= 2;
                // number = 7
                // number = 5
            }
        }while(number > 10);
        System.out.println("number = " + number);
    }
}
