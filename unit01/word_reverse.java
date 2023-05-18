package unit01;

public class word_reverse {

	public static void main(String[] args)
	{
		String s = "abcd efgh", ans = "";
		s = s.trim();
		s = s+' ';
		String s1 = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				for(int j=s1.length()-1;j>=0;j--)
				{
					ans = ans + s1.charAt(j);
				}
				ans = ans + ' ';
				s1 = "";
			}
			else
			{
				s1 = s1 + s.charAt(i);
			}
		}
		System.out.println(ans);
	}

}
