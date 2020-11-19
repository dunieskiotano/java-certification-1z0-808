package mdc.methods;

public class AnotherMain {
    public static String ssn = "123456789";
    protected static char grade = 'A';
    static char grade2 = 'B';
    private static String privateString = "Private";

    public static void main(String[] args) {
        System.out.println("print in another main");
        String privateText = getPrivateString();
        System.out.println(privateText);
    }
    public static String printName(String name){
        return name;
    }
    public static String getPrivateString(){
        return privateString;
    }


}
