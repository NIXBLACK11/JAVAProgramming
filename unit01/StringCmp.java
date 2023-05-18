package unit01;

import java.io.*;

public class StringCmp {

	public static void main(String[] args) throws IOException{
		BufferedReader buff  = new BufferedReader(new InputStreamReader(System.in));
		String s1 = buff.readLine(), s2 = buff.readLine();
		int len1 = s1.length(), len2 = s2.length();
		if(len1!=len2)
		{
			System.out.println("Not equal");
			return;
		}
		for(int i=0;i<len1;i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.println("Not equal");
				return;
			}
		}
		System.out.println("Equal");
	}

}
