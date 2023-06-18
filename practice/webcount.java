package practice;

public class webcount
{
    public static void main(String[] args) throws InterruptedException
    {
        countOb ob = new countOb();
        countOb.count = 0;
        Thread one = new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0; i < 10000; i++) {
                    ob.Incre();
                }
            }
        });
        Thread two = new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0; i < 10000; i++) {
                    ob.Incre();
                }
            }
        });

        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println(countOb.count);
    }
}

class countOb
{
    static int count;
    synchronized void Incre()
    {
        count++;
    }
}