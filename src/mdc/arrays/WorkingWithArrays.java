package mdc.arrays;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] one = new int[3]; // empty array => 0, 0, 0
        for (int x = 0; x < one.length; x++) {
            System.out.println(one[x]);
        }
        one[0] = 11;
        one[1] = 12;
        one[2] = 13;
        System.out.print("Array one => ");
        for (int x = 0; x < one.length; x++) {
            System.out.print(one[x] + " ");
        }
        System.out.println();
        //int one1[] = new int[3]; this is another way to declare an array
        //                     0   1    2
        int[] two = new int[]{10, 11, 12}; // array with three elements, not empty
        System.out.print("Array two => ");
        for (int x = 0; x < two.length; x++) {
            System.out.print(two[x] + " ");
        }

        // array length is always an integer
        // double[] b = new double[2.55]; this will not compile

        double[] b = new double[4 * 5 / 2 + 1]; // initializes an array with size 11
        for (int i = 1; i < b.length; i++) {
            b[i] = i;
        }
        System.out.println();
        for (int x = 0; x < b.length; x++) {
            System.out.print(b[x] + " ");
        }

        int x = 4;
        int y = 4;

        double[] c = new double[x * y]; // create an array of 16 elements

        int[] three = {10, 11, 12}; // an anonymous array
        int[] four = {}; // anonymous empty array

        int[] a1;
        int[] a2;
        int a3[];
        int a4[];

        int[] ids, types; // this will create two arrays
        int ids2[], types2; // creates array and an int, bad practice

        System.out.println();
        String[] animals = {"Parrot", "Dog", "Cat"};
        String[] myAnimals = animals;
        String[] otherAnimals = {"Parrot", "Dog", "Cat"};

        System.out.println("animals.equals(myAnimals) => " + animals.equals(myAnimals)); // true
        System.out.println("animals == myAnimals => " + (animals == myAnimals)); // true
        System.out.println("Arrays.equals(animals, otherAnimals) => " + Arrays.equals(animals, otherAnimals)); //false
        System.out.println("animals == otherAnimals => " + (animals ==  otherAnimals)); // true

        System.out.println("animals hash code => " + System.identityHashCode(animals));
        System.out.println("mAnimals hash code => " + System.identityHashCode(myAnimals));
        System.out.println("otherAnimals hash code => " + System.identityHashCode(otherAnimals));

        System.out.println(animals); // [Ljava.lang.String;@2acf57e3
        System.out.println(animals.toString()); // [Ljava.lang.String;@2acf57e3
        System.out.println(Arrays.toString(animals));

        int counter = 1;
        for (String animal:  animals){
            System.out.println(counter + "." + animal +  " ");
            counter++;
        }
    }
}
