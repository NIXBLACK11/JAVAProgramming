public class Threading_basic {
    public static void main(String[] args) {
        //----------------------------------------------
        Thread one = new Thread(new Runnable(){
			public void run(){
				for(int i=1;i<=1000;i++)
				{
					//web.webcount();
				}
			}
		});
        one.start();
        //----------------------------------------------
        new Thread(){
            public void run()
            {
                //ob.withdraw(15000);
            }
        }.start();
        //----------------------------------------------
        Thread t1 = new Thread(new T11(), "T11 Thread!");
		//----------------------------------------------
		Thread producer = new Thread(new Producer(buffer, maxSize, "PRODUCER"));//can also be written as this
        Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
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