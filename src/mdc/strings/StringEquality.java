package mdc.strings;

public class StringEquality {
    public static void main(String[] args) {
        String name = "John"; // => 1018547642
        String anotherName = "John"; // => 1018547642
        String john = "Jo" + "hn"; // "John" => 1018547642
        String newName = new String("John"); // => 191382150

        // == checks location of the object in memory
        // equals() checks content of the object
        System.out.println("name hash code: " + System.identityHashCode(name));
        System.out.println("anotherName hash code: " + System.identityHashCode(anotherName));
        System.out.println("john hash code: " + System.identityHashCode(john));
        System.out.println("newName hash code: " + System.identityHashCode(newName));

        System.out.println("name == anotherName => " + (name == anotherName)); // returns true
        System.out.println("name == john => " + (name == john)); // returns true
        System.out.println("name == newName => " + (name == newName)); // returns false

        System.out.println("name.equals(anotherName) => " + (name.equals(anotherName))); // returns true
        System.out.println("name.equals(john) => " + (name.equals(john))); // returns true
        System.out.println("name.equals(newName) => " + (name.equals(newName))); // returns true

        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";

        System.out.println("str1 hash code = " + System.identityHashCode(str1)); // returns 1468177767
        System.out.println("str2 hash code = " + System.identityHashCode(str2)); // returns 434091818
        System.out.println("str3 hash code = " + System.identityHashCode(str3)); // returns 398887205

        System.out.println("str1 == str2 => " + (str1 == str2)); // returns false
        System.out.println("str1 == str3 => " + (str1 == str3)); // returns false

        System.out.println("str1.equals(str2) => " + (str1.equals(str2))); // returns false
        System.out.println("str1.equals(str3) => " + (str1.equals(str3))); //returns true

    }
}
