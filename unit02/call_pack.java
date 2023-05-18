package unit02;

import unit01.test;

class call extends test
{
	call()
	{
		System.out.println("call const");
		met();
	}
}

public class call_pack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test ob = new test();
		ob.met();
		System.out.println("-----------");
		call ob1 = new call();
	}

}
