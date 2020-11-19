package mdc.methods;

public class PassingDataBetweenMethods {

    public static void main(String[] args) {
        int number = 4;
        System.out.println("number = " + number);
        newNumber(number);
        System.out.println("number = " + number);

        String name  = "Jimmy";
        System.out.println("name = " + name);
        newName(name);
        System.out.println("name = " + name);

        StringBuilder sb = new StringBuilder();
        StringBuilder s = sb;
        s.append("Anthony ");
        s.append("Julian ");
        sb.append("Dunieski ");
        build(sb);
       // System.out.println("s = " + s);
        System.out.println("stringBuilder = "  + sb);
    }

    public static void newNumber(int number){
        System.out.println("In newNumber number = " + number);
        number = 10;
        System.out.println("In newNumber number = " + number);
    }

    public static void newName(String name){
        System.out.println("in newName name = " + name);
        name = "Timmy";
        System.out.println("in newName name = " + name);
    }

    public static void build(StringBuilder s){
        //s = new StringBuilder();
        s.append("Tom");
        s.append(" Cortes");
        s.append(" left");
        s.append(" this");
        s.append(" morning");
    }
}
