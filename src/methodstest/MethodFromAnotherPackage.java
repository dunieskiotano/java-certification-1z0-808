package methodstest;

import mdc.methods.Common;

public class MethodFromAnotherPackage {
    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();

        System.out.println("publicNumber = " + common.publicNumber);
        System.out.println("privateNumber = " + common.getPrivateNumber());
    }

}
