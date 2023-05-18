package unit01;

public class staticandnonstaticmethodsandvariables
{
	public static void main(String[] args)
	{
		/*
			 A static method is a method that belongs to a class but it does not belong to an instance of that class and this method can be called without the instance or object of that class.
			 A static method can only access static data members and static methods of another class or same class but cannot access non-static methods and variables.
			 But this rule is not applied on non-static members and variables.
		*/
		ABCD obj = new ABCD();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(ABCD.b);
		obj.m2();
		ABCD.m2();
	}

}

class ABCD
{
	int a = 11;
	static int b = 12;
	void m1()
	{
		System.out.println(a+b);
	}
	static void m2()
	{
		System.out.println(b);
	}
}