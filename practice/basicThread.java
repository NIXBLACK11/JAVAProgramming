package practice;

import java.util.Scanner;

public class basicThread {
    public static void main(String[] args) throws InterruptedException{
        Thread T11 = new Thread(new T11(), "First Thread");
        Thread T22 = new Thread(new T22(), "Second Thread");
        T11.start();
        T22.start();
        T11.join();
        T22.join();
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
                try{
                    Thread.sleep(1000);
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
        System.out.println("Enter the value:");
        int a = sc.nextInt();
        System.out.println("The value is:"+a);
        System.out.println(Thread.currentThread().getName());
    }
}