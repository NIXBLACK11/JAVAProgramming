package practice;

public class depste {
    public static void main(String[] args) {
        transfer ob = new transfer(1000);
        new Thread(){
            public void run()
            {
                ob.withdraw(1500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.withdraw(1500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.withdraw(1500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.withdraw(1500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.withdraw(1500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.deposit(1000);
            }
        }.start();
    }
}


class transfer
{
    int total;
    transfer(int total)
    {
        this.total = total;
    }
    public synchronized void deposit(int amt)
    {
        System.out.println("Successfully Deposited");
        total+=amt;
        System.out.println("Total is:"+total);
        notifyAll();
    }
    public synchronized void withdraw(int amt)
    {
        while(total-amt<0)
        {
            try{
                System.out.println("Insufficient balance");
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Successfully Withdrawed");
        total-=amt;
        System.out.println("Total is:"+total);
    }
}