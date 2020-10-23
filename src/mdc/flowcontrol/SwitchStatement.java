package mdc.flowcontrol;

import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        int dayOfTheWeek = 0;

        switch(dayOfTheWeek){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                // break;
        }
        Random rand = new Random();
        int c = rand.nextInt(26) + 'a'; // adding offset to product lower case letters
        System.out.println((char) c + ", " + c + ": ");
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println((char)c + " = vowel");
                break;
            case 'y':
            case 'w':
                System.out.println((char)c + " = Sometimes a vowel");
                break;
            default:
                System.out.println((char)c + " = consonant");
        }

        int x = 7;
        switch(x){
            case 4:
            // case x: => this does not compile bc a constant expression is required
            case 'K':
            //case "Test": this won't compile
            case 4 + 4:
                System.out.println(3 + 4);
        }

    }
}
