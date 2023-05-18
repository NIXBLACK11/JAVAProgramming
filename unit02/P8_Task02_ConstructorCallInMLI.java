package unit02;

class A
{
	A()
	{
		System.out.println("A non-parameterized");
	}
	A(int a)
	{
		System.out.println("A parameterized" + a);
	}
}

class B extends A
{
//	B()
//	{
//		System.out.println("B non-parameterized");
//	}
	B(int a)
	{
//		super(a);
		System.out.println("B parameterized" + a);
	}
}

class C extends B 
{
	C()
	{
		super(10);
		System.out.println("C non-parameterized");
	}
	C(int a)
	{
		super(a);
		System.out.println("C parameterized" + a);
	}
}


public class P8_Task02_ConstructorCallInMLI {

//	- Create multilevel chain of 3
//	- class A and class C contain both default and parameterised constructor
//	- class B contain only a single parameterised constructor
//	- use super keyword if required
//	- Create object of class C and fix the code if required
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob = new C(44);
	}

}
