package practice;

import java.util.*;

public class inputThread 
{
    public static void main(String[] args) throws InterruptedException {
        Thread T1 = new Thread(new T11(), "First Thread");
        Thread T2 = new Thread(new T22(), "Second Thread");
        T1.start();
        T2.start();
        T1.join();
        T2.join();
        System.out.println(Thread.currentThread().getName());
    }   
}

class T11 extends Thread
{
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            System.out.println("Thread"+i);
            if(i==10)
            {
                System.out.println("Wait--------------");
                try{
                    Thread.sleep(10000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}

class T22 extends Thread
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();
        System.out.println("Value is:"+a);
        System.out.println(Thread.currentThread().getName());
    }
}