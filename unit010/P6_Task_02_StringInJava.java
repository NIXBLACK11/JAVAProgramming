package unit01;

public class P6_Task_02_StringInJava {

	public static void main(String[] args) {
		String s1 = "test123";
		String s3 = "test123";
		if(s1.length()!=s3.length())
		{
			System.out.print("Not Same");
			return;
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s3.charAt(i))
			{
				System.out.println("Not Same");
				return;
			}
		}
		System.out.println("same");

	}

}
