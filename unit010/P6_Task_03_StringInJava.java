package unit01;

public class P6_Task_03_StringInJava {

	public static void main(String[] args) {
		String s = "This is a string";
		s+=' ';
		String s1 = "";
		String s2 = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch!=' ')
			{
				s1 = s1+ch;
			}
			else
			{
				s2 = s1 +' '+s2; 
				s1 = "";
			}
		}
		System.out.print(s2);

	}

}
