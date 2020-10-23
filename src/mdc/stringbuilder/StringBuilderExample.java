package mdc.stringbuilder;

public class StringBuilderExample {

    public static String returnValue(){
        return "Java ";
    }

    public static void main(String[] args) {
        String myString = "";

        System.out.println();
        for (char c = 'a'; c <= 'z'; c++){
            myString += c + " ";
        }
        System.out.println(myString);

        // with StringBuilder
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++){
            sb.append(c);
        }
        System.out.println(sb);

        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle"); // start-middle
        StringBuilder anotherBuilder = builder.append("-end");
        // builder = start-middle-end, anotherBuilder = start-middle-end
        //builder.append("-English").append("-Spanish");
        // builder = start-middle-end-English-Spanish

        System.out.println("builder = " + builder);
        System.out.println("anotherBuilder = " + anotherBuilder);

        System.out.println("builder == anotherBuilder => " + (builder == anotherBuilder));
        System.out.println("builder.equals(anotherBuilder) => " + (builder.equals(anotherBuilder)));

        System.out.println("builder hash code  => " + System.identityHashCode(builder));
        System.out.println("anotherBuilder hash code  => " + System.identityHashCode(anotherBuilder));


        StringBuilder myBuilder = new StringBuilder("Java is Great");
        System.out.println("size = " + myBuilder.length()); // size = 13
        System.out.println("capacity = " + myBuilder.capacity()); // capacity = 29

        myBuilder = new StringBuilder(100);
        System.out.println("size = " + myBuilder.length()); // size = 0
        System.out.println("capacity = " + myBuilder.capacity()); // capacity = 100


        StringBuilder  a = new StringBuilder(returnValue());
        StringBuilder b = a.append("Java ");
        b = b.append("is").append(" so ").append("Cool");
        b = b.append(" Hi Hi Hi");
        a = a.append(" Oh Oh Oh");
        b = b.append(" I can see how shocked you are with this!!");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }



}
