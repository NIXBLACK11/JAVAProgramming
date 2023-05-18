/* 
    notify pulls one thread chosen by jvm out of wait state
    notifyall pulls all out of wait state
    new Thread(){
        public void run(){
            c.withdraw(15000);
        }
    }.start();

    Thread T1 = new Thread(new Thread())
    t1

    pehle wale if ko while phir dusra if hata do
    notifyall() 
*/
public class P14_Task05_DepositAndWithdraw {
    public static void main(String[] args) {
        SharedResource ob = new SharedResource();
        new Thread(){
            public void run()
            {
                ob.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run()
            {
                ob.deposit(10000);
            }
        }.start();
    }
}


class SharedResource{
    int amount = 10000;
    synchronized void withdraw(int amount)
    {
        System.out.println("Going to withdraw");

        if(this.amount<amount)
        {
            System.out.println("Less balance wait");
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        int temp = this.amount - amount;

        if(temp<0)
        {
            System.out.println("negative balance");
            try{
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        this.amount = temp;
        System.out.println("Now total amount is:"+this.amount);
        System.out.println("withdraw completed");
    }
    synchronized void deposit(int deposit)
    {
        System.out.println("going to deposit");
        this.amount +=amount;
        System.out.println("deposit complete");
        System.out.println("amount:"+this.amount);
        // notify();
        notifyAll();
    }
}