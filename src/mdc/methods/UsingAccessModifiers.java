package mdc.methods;

public class UsingAccessModifiers {
    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.defaultPrint();
        common.protectedPrint();

        System.out.println("publicNumber = " + common.publicNumber);
        System.out.println("defaultNumber = " + common.defaultNumber);
        System.out.println("protectedNumber = " + common.protectedNumber);
    }
}
