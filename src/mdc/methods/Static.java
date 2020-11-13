package mdc.methods;

public class Static {

    private String name = "Static";

    public static void one(){}
    public static void two(){}

    public static void three(){
        one();
        two();
    }
    // You can a static method(s) from a non-static context
    // but you cannot call a non-static from a static context
    // non-static => non-static      => means call
    // static => static
    // non-static => static
    public void four(){
        one();
        two();
        three();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Static.one();
        one();
        two();
        three();
        // four => non-static, cannot be called from within a static context

        Static myInstance = new Static();
        myInstance.four();

        new Static().four();
        System.out.println(new Static().name);

        String name = new Static().name;
        System.out.println(name);

        // for static variables or methods, you don't need to instantiate the class
        // simply, use the class name and refer to a variable or call the method
    }

}
