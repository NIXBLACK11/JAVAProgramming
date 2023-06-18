public class DepositUsingWhile {
    public static void main(String[] args) {
        Transactions ob = new Transactions(10000);
        
        new Thread() {
            public void run() {
                ob.withdraw(15000);
            }
        }.start();
        
        new Thread() {
            public void run() {
                ob.withdraw(15000);
            }
        }.start();
        
        new Thread() {
            public void run() {
                ob.withdraw(15000);
            }
        }.start();
        
        new Thread() {
            public void run() {
                ob.withdraw(15000);
            }
        }.start();
        
        new Thread() {
            public void run() {
                ob.withdraw(15000);
            }
        }.start();
        
        new Thread() {
            public void run() {
                ob.deposit(5000);
            }
        }.start();
    }
}

class Transactions {
    int total;

    Transactions(int total) {
        this.total = total;
    }

    synchronized void withdraw(int Takeamount) {
        while (total - Takeamount < 0) {
            try {
                System.out.println("Insufficient balance");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        total = total - Takeamount;
        System.out.println("Successful withdraw");
        System.out.println("Balance: " + total);
    }

    synchronized void deposit(int Giveamount) {
        total = total + Giveamount;
        System.out.println("Successful deposit");
        System.out.println("Balance: " + total);
        notifyAll();
    }
}