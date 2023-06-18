package practice;

public class ThreadClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T1(), "first");
        Thread t2 = new Thread(new T2(), "second");

    }
}
class T1 extends Thread{
    public void run()
    {
        for (int i = 0; i < 1000; i++)
        {
            System.out.println();    
        }
    }
}

class T2 extends Thread{
    public void run()
    {

    }
}