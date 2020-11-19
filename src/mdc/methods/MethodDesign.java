package mdc.methods;

import java.util.Arrays;

public class MethodDesign {
    public void jump(){}
    //void public jump2(){} => this will not compile

    void jump3(){} //  
    public final void jump4(){}
    public static final void jump5(){}
    public final static  void jump6(){}

    public void jump7(){
        int[] array = {2, 3, 4};
        System.out.println(Arrays.toString(array));
    }

    //public array void jump8(){} this does not compile
    //public String int float double jump8(){}

    // public void final jump9(){} this will not compile as final is not allowed where it is now

    final static public void jump10(){}
    //String int public void jump11(){} this will not compile







}
