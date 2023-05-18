// package unit03;

import java.util.Scanner;

public class P15_Multithreading_In_Java {

	public static void main(String[] args) {
//		TODO Auto-generated method stub
//		C1 obj1 = new C1();
//		obj1.show1();
//		System.out.println();
//		
//		C2 obj2 = new C2();
//		obj2.show2();
		
		Thread t1 = new Thread(new T11(), "T11 Thread!");
		Thread t2 = new Thread(new T22(), "T22 Thread!");
		
		// t1.run();
		// t2.run();
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
//		JVM automatically thread named main 
	}

}

class T11 extends Thread
{
	public void run()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = obj.nextInt();
		
		System.out.println(a);
		System.out.println("Done with show1()!");
		obj.close();
		
		System.out.println(Thread.currentThread().getName());
//		try
//		{
//			Thread.sleep(100);
//			System.out.println("Done with wait");
//		}
//		catch(InterruptedException e)
//		{
//			e.printStackTrace();
//		}
	}
//	public void test()
//	{
//		System.out.println("Done with test()!");
//	}
}

class T22 extends Thread
{
	public void run()
	{
		// without sleep put i<=5000
		for(int i=1;i<=100;i++)
		{
			if(i==10)
			{
				try
				{
					Thread.sleep(100);
					System.out.println("Done with wait");
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			System.out.println(i + "Show2()");
			
		}
		
		System.out.println(Thread.currentThread().getName());
	}
}

class C1
{
	void show1()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = obj.nextInt();
		System.out.println("Done with show1()!");
		obj.close();
	}
}

class C2
{
	void show2()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println(i + "Show2()");
		}
	}
}