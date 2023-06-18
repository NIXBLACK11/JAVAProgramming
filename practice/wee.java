package practice;

public class wee {
    public static void main(String[] args) throws InterruptedException{
        wc ob = new wc();
        wc.count = 0;
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=0;i<10000;i++)
                {
                    ob.increment();
                }
                System.out.println(Thread.currentThread().getName());
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=0;i<10000;i++)
                {
                    ob.increment();
                }
                System.out.println(Thread.currentThread().getName());
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(wc.count);
        System.out.println(Thread.currentThread().getName());
    }
}


class wc
{
    static int count;
    synchronized void increment()
    {
        count++;
    }
}