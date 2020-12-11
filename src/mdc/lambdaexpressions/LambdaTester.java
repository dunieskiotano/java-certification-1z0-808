package mdc.lambdaexpressions;

interface MathOperation{
    int operation(int a, int b);
}

interface GreetingService{
    void sayMessage(String message);
}

interface Name{
    void printName(String name);
}

public class LambdaTester {
    public static void main(String[] args) {
        LambdaTester tester = new LambdaTester();

        // with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        // without type declaration
        MathOperation subtraction = (a, b) -> a - b;

        // with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {return a * b;};

        // with return statement along with curly braces
        MathOperation division = (int a, int b) -> {return a / b;};

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        Name name = n -> System.out.println("My name is " + n);
        name.printName("Dunieski Otano");

        //without parenthesis
        GreetingService greetingService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetingService2 = (message) ->
                System.out.println("Hello " + message);

        greetingService1.sayMessage("Maria");
        greetingService2.sayMessage("Anant");

    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
