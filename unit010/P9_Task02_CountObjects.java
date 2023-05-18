package unit01;

public class P9_Task02_CountObjects {
	static int count;
	static
	{
		count = 0;
	}
	P9_Task02_CountObjects()
	{
		count++;
	}
}


class ABC
{
	public static void main(String args[])
	{
		P9_Task02_CountObjects ob=new P9_Task02_CountObjects();
		P9_Task02_CountObjects ob1=new P9_Task02_CountObjects();
		P9_Task02_CountObjects ob2=new P9_Task02_CountObjects();
		P9_Task02_CountObjects ob3=new P9_Task02_CountObjects();
		P9_Task02_CountObjects ob4=new P9_Task02_CountObjects();
		P9_Task02_CountObjects ob5=new P9_Task02_CountObjects();
		P9_Task02_CountObjects ob6=new P9_Task02_CountObjects();
		P9_Task02_CountObjects ob7=new P9_Task02_CountObjects();
		P9_Task02_CountObjects ob8=new P9_Task02_CountObjects();
		P9_Task02_CountObjects ob9=new P9_Task02_CountObjects();
		System.out.println(count);
	}
}
