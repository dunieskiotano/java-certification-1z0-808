package mdc.methods;

public class PlayWithMethods {
    public static void main(String[] args) {
        int sum = addition(4, 6);
        System.out.println("Sum is " + sum);
        System.out.println("Sum is " + addition(4, 6));
        System.out.println(sum);
        System.out.println(sum);
        System.out.println(sum);
        System.out.println(sum);
        System.out.println(sum);
        System.out.println("Sum is " + addition(4, 6));
        System.out.println("Sum is " + addition(4, 6));
        System.out.println("Sum is " + addition(4, 6));
        System.out.println("Sum is " + addition(4, 6));
        System.out.println("Sum is " + addition(4, 6));
    }

    private static int addition(int a, int b){
        //int sum = a + b;
        return a + b;
    }
}

//In a class called Master,
// 1. Create a protected variable
// 2. Create a default variable
// 3. Create a private variable
// 4. Create a public variable
// 5. Create other classes, one Test1 in the same package, and Test2 in a different package
// 6. Instantiate the Master in the other classes and test the access modifiers

