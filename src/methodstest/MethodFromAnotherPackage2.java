package methodstest;

import mdc.methods.Common;

public class MethodFromAnotherPackage2 extends Common {
    @Override
    public void publicPrint() {
        System.out.println("Hi");
    }

    public MethodFromAnotherPackage2() {
    }

    @Override
    protected void protectedPrint() {
        super.protectedPrint();


    }

    public static void main(String[] args) {
        System.out.println("protectedNumber = " + Common.protectedNumber);
    }
}
