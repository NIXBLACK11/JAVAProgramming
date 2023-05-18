package unit01;

import java.io.*;

public class Palindrome {

	public static void main(String[] args) throws IOException{
		BufferedReader buff  = new BufferedReader(new InputStreamReader(System.in));
		String s = buff.readLine();
		int len = s.length();
		for(int i=0,j=len-1;i<len/2;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				System.out.println("Not Palindrome");
				return;
			}
		}
		System.out.println("Palindrome");
	}

}
