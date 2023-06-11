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

import java.util.InputMismatchException;
import java.util.Scanner;

public class P12_Task01_ExceptionHanding {
    public static void main(String[] args) {
        FunctionsOfException obj = new FunctionsOfException();
        obj.basicException();
        obj.handleException();
        obj.multipleCatch();
        obj.inputMismatchException();
        obj.stackOverFlowError();
        obj.indexOutOfBoundException();
        obj.nullPointerException();
        obj.useOfThrow();
        obj.useOfThrows_And_Finally();
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
    void multipleCatch()
    {

        try
        {
            int ans = a/b;
            int arr[] = new int[10];
            arr[11] = 1;

        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    void inputMismatchException()
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the string");
            int s = sc.nextInt();
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
    }
    void infiniteRecur()
    {
        infiniteRecur();
    }
    void stackOverFlowError()
    {
        try{
            infiniteRecur();
        }
        catch(StackOverflowError e){
            e.printStackTrace();
        }
    }
    void indexOutOfBoundException()
    {
        try{
            int arr[] = new int[10];
            arr[11] = 1;
        }
        catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    void nullPointerException()
    {
        try{
            String s = null;
            int l = s.length();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
    void useOfThrow()
    {
        try{
            throw new Exception("MyException");
        }
        catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
    void useOfThrows_And_Finally()
    {
        try{
            int res = divide(10, 0);
            System.out.println("Result:"+res);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally block");
        }
    }

    int divide(int a, int b)throws ArithmeticException
    {
        return a/b;
    }
}