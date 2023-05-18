public class P14_Task_02_Multithreading_Synchronization
{
	public static void main(String[] args) throws InterruptedException {
		WebCount web = new WebCount();
		
		Thread one = new Thread(new Runnable(){
			public void run(){
				for(int i=1;i<=1000;i++)
				{
					web.webcount();
				}
			}
		});
		
		Thread two = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=1000;i++)
				{
					web.webcount();
				}
			}
		});
		
		one.start();
		two.start();

        // Pehle ye do execute honge print se pehle
		one.join();
		two.join();

		System.out.println("Count:"+web.count);
	}
}


class WebCount
{
	public static int count = 0;
	
//	You want T1 to complete first and then
	public synchronized void webcount()
	{
//		If not synchronized then, one and two may read the same value and increment only once
//      But with synchronized we first one then two
		count++;
	}
}