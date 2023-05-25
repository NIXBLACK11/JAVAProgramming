package practice;
import java.util.*;

public class first
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new T1(), "Thread T1");
        Thread t2 = new Thread(new T2(), "Thread T2");

        // t1.start();
        // t2.start();

        // t1.run();   //only main thread no threading just like calling normally through object
        // t2.run();

        System.out.println(Thread.currentThread().getName());
    }
}

class T1 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("Iteration :"+i);
        }
        System.out.println("Done with thread T1");
        System.out.println(currentThread().getName());
    }
}

class T2 extends Thread
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int val = sc.nextInt();
        System.out.println("Entered value is :"+val);
        System.out.println("Done with thread T2");
        System.out.println(currentThread().getName());
        sc.close();
    }
}

class NT1
{
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("Iteration :"+i);
        }
        System.out.println("Done with class NT1");
    }
}

class NT2
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int val = sc.nextInt();
        System.out.println("Entered value is :"+val);
        System.out.println("Done with thread NT2");
        sc.close();
    }
}