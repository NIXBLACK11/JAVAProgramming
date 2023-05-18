package unit01;

import java.io.*;

public class P3_Task_01_ClaculatorInJava {

	public static void main(String[] args) throws IOException{
		BufferedReader buff  = new BufferedReader(new InputStreamReader(System.in));
		Calculator ob = new Calculator();
		char op;
		int a, b;
		while(true)
		{
			System.out.println("Enter the operation:");
			op = buff.readLine().charAt(0);
			System.out.println("Enter the numbers:");
			a = Integer.parseInt(buff.readLine());
			b = Integer.parseInt(buff.readLine());
			if(op == '+')
			{
				System.out.println("Output="+ob.add(a, b));
			}
			else if(op == '-')
			{
				System.out.println("Output="+ob.sub(a, b));
			}
			else if(op == '*')
			{
				System.out.println("Output="+ob.mul(a, b));
			}
			else if(op == '/')
			{
				System.out.println("Output="+ob.div(a, b));
			}
			else
			{
				System.out.println("Exit!");
				break;
			}
		}

	}

}


class Calculator{
	int add(int a, int b)
	{
		return a + b;
	}
	int sub(int a, int b)
	{
		return a-b;
	}
	int mul(int a, int b)
	{
		return a*b;
	}
	int div(int a, int b)
	{
		return a/b;
	}
}