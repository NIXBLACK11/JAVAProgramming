package unit01;

class A{
	A()
	{
		System.out.println("A Constructor!");
	}
}

class B extends A{
	B(int a)
	{
		System.out.println("B Constructor! "+a);
	}
}

class C extends B{
	C()
	{
		super(123);
		System.out.println("C Constructor!");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob = new C();
	}

}
