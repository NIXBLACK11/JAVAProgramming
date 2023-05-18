// package unit03;

// import java.io.*;
// Firstly create a P12_Task01_ExceptionHanding public class, and psvm main method. Create a separate class name FunctionsOfException and through the object of this class perform given operations:
// 1- obj.basicException() {/ by zero but unhandled exception}
// 2- obj.handleException() {use of try and catch, handled exception}
// 3- obj.multipleCatch() {multiple catch for one try block}
// 4- obj.inputMismatchException() {nextInt() and enter string}
// 5- obj.stackOverFlowError() {unstoppable recursion}
// 6- obj.indexOutOfBoundException() {a[10] in a[3] array, index out of bound}
// 7- obj.nullPointerException() {s.lenght() when s is null}
// 8- obj.useOfThrow() {manually throw exception}
// 9- obj.useOfThrows_And_Finally() {declare what possible exceptions may occur, finally always run}
public class P12_Task01_ExceptionHanding {
    public static void main(String[] args) {
        FunctionsOfException obj = new FunctionsOfException();
        obj.basicException();
    }
}


class FunctionsOfException
{
    int a = 10, b = 0;
    void basicException()
    {
        int ans = a/b;
    }
    void handleException()
    {
        try
        {
            int ans = a/b;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    void multipleCatch() throws Exception
    {

        try
        {
            int ans = a/b;
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }
}