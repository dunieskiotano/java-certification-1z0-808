package mdc.exceptionhandling;

class MuseumClosed extends RuntimeException {
}

class MuseumClosedForLunch extends MuseumClosed {
}

public class CatchingExceptions {
    public static void main(String[] args) {
        try {
            visitMuseum();
        } catch (MuseumClosedForLunch mc) { // subclass
            System.out.println("Closed for lunch. Will come back in 2 hours");
        } catch (MuseumClosed mc) {
            System.out.println("Closed");
        }
        System.out.println(calculate());
    }

    public static String calculate() {
        String result = "";
        String str = null;

        try {
            try {
                result += "start"; // result = start
                str.length();
                result += "end";
            } catch (NullPointerException e) {
                result += "npe"; // result = startnpe
            } finally {
                result += "finally"; // result = startnpefinally
                System.out.println("I have been printed no matter what");
                throw new Exception();
            }
        } catch (Exception e) {
            result += "finished"; // result = startnpefinallyfinished
        }
        return result;
    }

    public static void visitMuseum() {
        double num = Math.random();
        boolean b = num < 0.5;
        System.out.println("The randomly generated number is " + num);
        if (b) {
            throw new MuseumClosed();
        }
        throw new MuseumClosedForLunch();
    }
}
