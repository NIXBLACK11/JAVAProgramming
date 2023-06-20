package practice;

public class depoo {
    public static void main(String[] args) {
        Transaction ob = new Transaction();

    }
}

class Transaction
{
    int total;
    synchronized void deposit(int amt)
    {
        total+=amt;
    }
    synchronized void withdraw(int amt)
    {
        
    }
}