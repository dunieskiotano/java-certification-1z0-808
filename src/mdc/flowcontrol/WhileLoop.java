package mdc.flowcontrol;

public class WhileLoop {
    public static void main(String[] args) {
        int spaceOnOdd = 5;
        while (spaceOnOdd > 0) {
            spaceOnOdd--; // 5, 4, 3, 2, 1, 0 => exits the while loop because 0 is not greater than 0
            System.out.println("spaceOnOdd = " + spaceOnOdd);
        }

        int x = 2;
        int y = 5;

        int counter = 1;
        while (x < 10) {
            x++;
            y++;
            System.out.println("// " + counter + ". iteration x = " + x + ", y = " + y);
            counter++;
            // 1. iteration x = 3, y = 6
            // 2. iteration x = 4, y = 7
            // 3. iteration x = 5, y = 8
            // 4. iteration x = 6, y = 9
            // 5. iteration x = 7, y = 10
            // 6. iteration x = 8, y = 11
            // 7. iteration x = 9, y = 12
            // 8. iteration x = 10, y = 13
        }
        System.out.println("x = " + x + ", y = " + y);

        int a = 5;
        int b = 7;

        // while(boolean expression){write your code here}
        // a is < 6  while loop will never execute
        while (a > 6) {
            b += 2;
            a++;
        }
        a = a > 6 ? a++ : b--;
        // false
        // a = b => a = 7
        // b-- -> b = b - 1 -> b = 6
        // 7 + 6 = 13
        // a = 7
        // b = 6
        // (a + b) = 13

        System.out.println(a + ", " + b + ", " + (a + b)); // 7, 6, 13
    }
}
