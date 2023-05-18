package unit02;

class Bike
{  
	void run(int a)
	{
		System.out.println("running");
	}
} 
	
class Splendor extends Bike
{  
	void run(String s)
	{
		System.out.println("running safely with 60km");
	}
}

public class P10_Task02_RunTimeMethodDispatch
{
	public static void main(String[] args)
	{
		Bike b = new Splendor();//upcasting
		b.run(1);  
	}
}
