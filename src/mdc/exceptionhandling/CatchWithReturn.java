package mdc.exceptionhandling;

public class CatchWithReturn {
    public static void main(String[] args) {
        System.out.println(calculate());
    }
    public static int calculate(){
        try{
            return 10/1;
        }catch(ArithmeticException e){
            System.out.println("error");
            System.exit(0);
            return 1;
        }finally {
            System.out.println("finally");
            return 0;
        }
    }
}
