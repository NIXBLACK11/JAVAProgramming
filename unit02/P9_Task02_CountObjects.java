package unit02;

class Aa
{
	static int count;
	static{
		count = 0;
	}
	Aa()
	{
		count++;
	}
}

public class P9_Task02_CountObjects {
	/*
	 	- Check how many objects of a class are being created
		- Hint: use static variable to track the count
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa.count = 0;
		Aa o[] = new Aa[5];
		o[0] = new Aa();
		Aa ob = new Aa();
		Aa ob1 = new Aa();
		Aa ob2 = new Aa();
		System.out.println(Aa.count);
	}

}
