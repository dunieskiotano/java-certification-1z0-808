package mdc.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DealingWithExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 >> ");
        int a = input.nextInt();
        System.out.print("Enter number 2 >> ");
        int b = input.nextInt();
        try {
            int[] myArray = new int[3];
            System.out.println("MyArray = " + myArray[4]);
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("You array index does not exist");

            try {
                double result = divide(a, b);
                System.out.println("result = " + result);
                System.out.println("Enter integer >> ");
                int choice = input.nextInt();
                System.out.println("choice " + choice);
            } catch (ArithmeticException e) {
                System.out.println("Division by " + b + " is not defined");
            } catch (InputMismatchException i) {
                System.out.println("Wrong type");
            }
        }
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}

