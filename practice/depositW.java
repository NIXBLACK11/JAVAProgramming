package practice;

public class depositW {
    public static void main(String[] args) {
        Transaction ob = new Transaction(1000);
        new Thread(){
            public void run()
            {
                ob.Withdraw(1500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.Withdraw(1500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.Withdraw(1500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.Withdraw(1500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.Withdraw(1500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.Deposit(1000);
            }
        }.start();
    }
}

class Transaction
{
    int Total;
    Transaction(int Total)
    {
        this.Total = Total;
    }
    synchronized void Deposit(int deposit)
    {
        System.out.println("Successfully Deposited");
        Total+=deposit;
        System.out.println("Total is:"+Total);
        notifyAll();
    }
    synchronized void Withdraw(int withdraw)
    {
        while(withdraw>Total)
        {
            try
            {
                System.out.println("Insufficient balance");
                wait();
            }catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Successfully Withdrawed");
        Total-=withdraw;
        System.out.println("Total is:"+Total);
    }
}