package unit01;

public class P6_Task_05_StringInJava
{
	public static void main(String[] args)
	{
		String s = "qwertyuiop  asdfgh hjkl;  zxcvbnm";
		for(char ch = 'a';ch<='z';ch++)
		{
			boolean check = false;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==ch)
				{
					check = true;
				}
			}
			if(check == false)
			{
				System.out.println("Not");
				return;
			}
		}
		System.out.println("Yes");
	}

}
