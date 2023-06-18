package practice;

public class wc {
    public static void main(String[] args) throws InterruptedException{
        webC ob = new webC();
        webC.count = 0;
        Thread one = new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0; i < 10000; i++) {
                    ob.webCo();
                }
            }
        });
        Thread two = new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0; i < 10000; i++) {
                    ob.webCo();
                }
            }
        });
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println(webC.count);
    }
}

class webC
{
    static int count;
    synchronized void webCo()
    {
        count++;
    }
}