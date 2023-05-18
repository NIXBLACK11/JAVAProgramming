package unit02;

class ABC
{
	int add(int a, int b)
	{
		return a+b;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
}

class CBA extends ABC
{
	int add(int a, int b, int c)
	{
		return a+b+c+10;
	}
}

public class P10_Task01_PolymorphismInJava {

//	- Run time method dispatch
//	- Create a child class name CBA of ABC
//	- Perform overloading and overriding of method add(., ., .)
	public static void main(String[] args)
	{
		ABC ob = new CBA();
		System.out.println(ob.add(100, 10, 10));
	}

}
