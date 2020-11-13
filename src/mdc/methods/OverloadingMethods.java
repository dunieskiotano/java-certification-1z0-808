package mdc.methods;

public class OverloadingMethods {

    public void walk(int miles){
    }
    public void walk(short feet){
    }
    public boolean walk(){
        return false;
    }
    void walk(int miles, short feet){
    }
    public static void walk(float miles){}

    //public int walk(float km){} does not compile
    //public static void walk(float miles){}

    public void walk(int[] lengths){}

    //public void walk(int... vars){}

    public static void run(int length){}

    public static void run(Integer length){}

    public static void run(double kilometer){}

    public static void jump(String s){
        System.out.println("string = " + s);
    }
    public static void jump(Object o){
        System.out.println("object = " + o);
    }
    public static void main(String[] args){
        run(9L);
        jump("test");
        jump(25);

        System.out.println(sum(1, 2));
    }

    public static int sum(int... numbers){
        System.out.println("sum var args");
        int sum = 0;
        for (int i : numbers){
            sum += i;
        }
        return sum;
    }

}
