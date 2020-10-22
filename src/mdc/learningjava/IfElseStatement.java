package mdc.learningjava;

public class IfElseStatement {
    public static void main(String[] args) {

        boolean b = false;
        if (!b) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        int x = 1;
        // if(x){} => this does not compile
        // if (x = 1){} => this does not compile

        if (x == 1) {
            System.out.println(x);
        }

        int testScore = 90;
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
        System.out.println("grade = " + grade);

        int hoursOfDay = 10;
        if (hoursOfDay < 11) System.out.println("Morning");
        else if (hoursOfDay < 17) System.out.println("Evening");
        else
            System.out.println("Day");
        hoursOfDay++;
        System.out.println(hoursOfDay);
        if (hoursOfDay < 17) {
            System.out.println("Afternoon");
        } else if (hoursOfDay < 11) { // 11 < 17, this will never be executed
            System.out.println("Morning");
        } else {
            System.out.println("Evening");
        }
    }
}
