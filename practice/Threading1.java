package practice;

public class Threading1 {
    public static void main(String[] args) throws InterruptedException {
        WebCount ob = new WebCount();
        WebCount.count = 0;
        Thread one = new Thread(new Runnable() {
           public void run()
           {
                for (int i = 0; i < 10000; i++)
                {
                    ob.webCount();
                }
           } 
        });
    
        Thread two = new Thread(new Runnable() {
            public void run()
            {
                for (int i = 0; i < 10000; i++)
                {
                    ob.webCount();
                }
            } 
        });

        one.start();
        two.start();

        one.join();
        two.join();

        System.out.println(WebCount.count);
    }
}


class WebCount
{
    public static int count;
    synchronized public void webCount()
    {
        count++;
    }
}