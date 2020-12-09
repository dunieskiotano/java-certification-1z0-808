package mdc.exceptionhandling;

public class CheckedVsUnchecked {
    public static void main(String[] args) throws Exception{
        myMethod();
    }
    public static void myMethod() throws Exception{
        throw new Exception("Failed to load");
    }
    public static void anotherMethod() throws RuntimeException{
        throw new RuntimeException("Wrong parameter");
    }
}
