// package unit03;
import java.util.*;
public class P14_Task01_MultithreadingJava {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Thread T1 = new Thread(new Runnable(){
			public void run(){
				for(int i=1;i<=1000;i++)
				{
					System.out.println("T1"+i);
				}
			}
		});
        Thread T2 = new Thread(new Runnable(){
			public void run()
            {
				System.out.println("Enter the number:");
                int num = sc.nextInt();
                for(int i=2;i<num;i++)
                {
                    if(num%i==0)
                    {
                        System.out.println("Not Prime");
                        return;
                    }
                }
                System.out.println("Prime");
			}
		});
        Thread T3 = new Thread(new Runnable(){
			public void run(){
				for(int i=1;i<=1000;i++)
				{
					System.out.println("T3"+i);
				}
			}
		});

        
        T1.start();
        T2.start();
        T3.start();    
        System.out.println("Main thread");
    }
}
