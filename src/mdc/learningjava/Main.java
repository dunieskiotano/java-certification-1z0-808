package mdc.learningjava;

public class Main {
    /**
     * This is the main method
     * @param args command line arguments
     */


    public static void main(String[] args) {
        System.out.println("args-size = " + args.length);

        // for loop
        for (int i = 0; i < args.length; i++){
            // i++ => i = i + 1
            System.out.println(args[i]);
            System.out.println("args[" + i + "] = " + args[i]); // prints list of program arguments



        }
    }

}
