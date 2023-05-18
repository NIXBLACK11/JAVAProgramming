package unit02;

class Ab
{
	static void smet()
	{
		System.out.println("static method!");
	}
	void nsmet()
	{
		System.out.println("non-static method!");
	}
}
public class P9_Task03_StaticAndNonStaticMethods
{
//	- Illustrate the best ways to call
//	  - static methods
//	  - non-static methods
	public static void main(String args[])
	{
		Ab ob = new Ab();
		ob.nsmet();
//		ob.smet();    The static method smet() from the type Ab should be accessed in a static way
		Ab.smet();
	}
}
