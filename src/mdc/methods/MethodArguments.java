package mdc.methods;

public class MethodArguments {
    int getZero(){ // 0 arguments => (niladic)
        return 0;
    }
    int increment(int number){ // 1 argument (monadic)
        return number + 1;
    }

    int sum(int a, int b){ // 2 arguments (dyadic)
        return a + b;
    }

    int plusMinus(int a, int b, int c){ // 3 arguments (triadic)
        return a + b - c;
    }

      static double average(double a, double b, double c, double d){// 4 arguments (polyadic)
        return (a + b + c + d) / 4.0;
    }

    public static void main(String[] args) {
        double average = average(4.3, 2.5, 4.7, 2.4);
        System.out.println(average);
    }

    //void test{}  this will not compile as it is missing the parentheses

    //void test(int a; int b){} this will not compile because arguments are not separated by semi colon but commas

    void test(int a, int b){}

    //void test2(int a); this will not compile as we are missing the method body => {}



}
