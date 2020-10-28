package mdc.arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Jimmy", "John", "Tom", "Anthony"};
        for(int i = 0; i < names.length; i++){
            System.out.println("name = " + names[i]);
        }

        for(String name: names){
            System.out.println("name = " + name);
        }
        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };
        StringBuilder[] builder1 = new StringBuilder[]{
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };
        StringBuilder[] builder3 = new StringBuilder[5];
        builder3[0].append("For");
        builder3[1].append("Loop");
        System.out.println("Builder 3 = " + builder3[0]);

        StringBuilder builder2 = new StringBuilder();
        System.out.println("Size = " + builder2.length());
        System.out.println("Capacity = " + builder2.capacity());

        for(StringBuilder builder : builders){
            System.out.println(builder);
        }

        String pets = "Parrot";
        for(char c : pets.toCharArray()){
            System.out.println(c);
        }
    }
}
