package mdc.methods;

public class ReturningDataFromMethods {
    public static void main(String[] args) {
        int number = 2;
        String word = "xyz";
        number = number(number);

        //word = word(word); // xyza
        System.out.println(number + " " + word(word));
    }

    public static int number(int number){
        number++;
        return number;
    }
    public static String word(String word){
        word += "a";
        return word;
    }
}
