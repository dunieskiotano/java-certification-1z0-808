package mdc.methods;

public class MethodReturnTypes {
    public void jump(){} // return type void
    public void jump2(){ // return type void
        return; // return is redundant
    }

    public String jump3(){
        return "hello";
    }
    //public String jump4(){} does not compile, no return statement
    //public jump5(){}  does not compile because it is missing a return type

    String jump6(int a){
        if(a == 5){
            return "";
        }
        return "abc";
    }

    int getInt(){
        return 9;
    }

    int getLong(){
        return (int)9L;
    }

    int expanded(){
        //int temp = 10 + 5;
        //return temp;
        return 10 + 5;
    }

    boolean isTrue(){
        //return 5 < 10;
        //return 5 == 5;
        return true;
    }
    public void test(){}
    //public void 2test(){} method names cannot start with a number
   // public void public(){} public cannot be the name of method, however Public can

    public void $test(){} // valid method name stating with $
    int $num = 10; // valid too
    public void _test(){} // valid method name stating _
    int _num = 10; // valid too

    //public void(){} this is WRONG, method name cannot be "void"



}
