package unit01;
import java.util.*;
class Calculate
{
	double add(int x,int y)
	{
		return  x+y;
	}	
	double subtract(int x, int y)
	{
		return  x-y;
	}
	double multiply(int x, int y)
	{
		return  x*y;
	}
	double divide(int x, int y)
	{
		return  x/y;
	}
}


public class P3_Task_01_ClaculatorInJava {

	public static void main(String[] args) {
		Calculate ob=new Calculate();
		Scanner sc=new Scanner(System.in);
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println(ob.add(x, y));
		System.out.println(ob.subtract(x, y));
		System.out.println(ob.multiply(x, y));
		System.out.println(ob.divide(x, y));
	}

}
