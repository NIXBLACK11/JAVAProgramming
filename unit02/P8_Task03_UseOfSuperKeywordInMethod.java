package unit02;

class A
{
	A()
	{
		System.out.println("AAAA");
	}
	A(int a)
	{
		System.out.println(a);
	}
	void met()
	{
		System.out.println("met through super");
	}
}

class B extends A
{
	void callA(int a)
	{
		super.met();
// 		super(a);
//		Implicit super constructor A() is undefined for default constructor. Must define an explicit constructor
	}
}

public class P8_Task03_UseOfSuperKeywordInMethod{

	/*
	 * - try to call super() from method area
	 * - copy the error and paste just above the line where you have used super()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob = new B();
		ob.callA(10);
	}

}
