package mdc.primitives;

public class TernaryOperators {

    public static void main(String[] args) {
        int x = 10;
        int y;

        if (x < 5) y = 2 * x;
        else y = 4 * x;
        System.out.println("y = " + y);

        // ternary operator

        y = (x < 5) ? (4 * 3) : (4 * x); // nicer to read
        // condition ? exprIfTrue : exprIfFalse

        System.out.println("y = " + y);

        int a = 2 > 3 ? 2 : 3 > 4 ? 3 : 4; // nested ternary operator
        System.out.println("a = " + a);

        if (2 > 3)
            System.out.println(2);
        else if (3 > 4)
            System.out.println(3);
        else
            System.out.println(4);

        int testScore = 30;
        char grade;

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else if (testScore >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        grade = testScore >= 90 ? 'A' : testScore >= 80 ? 'B' : testScore >= 70 ? 'C' : testScore >= 60 ? 'D' : testScore >= 50 ? 'E' : 'F';
        System.out.println("grade = " + grade);

        y = 1;
        System.out.println(y > 5 ? "Test" : 10);

        // int myInt = y > 5 ? "Test" : 10; this does not compile because we cannot assign a string to an int
        //System.out.println("myInt = " + myInt);

        int a1 = 1;
        int b = 1;
        int c = a1 < 10 ? a1++ : b++;

        System.out.println(a1 + ", " + b + ", " + c); // 2, 1, 1

        int d = 1;
        int e = 2;
        int f = 3;
        int g = 0;

        if (d < 10) {
            f = d++ < 1 ? e++ : f++;
        } else {
            f = (d + e) < 2 ? d++ : e++;
        }
        System.out.println(d + ", " + e + ", " + f); // returns 2, 2, 3
    }
}
