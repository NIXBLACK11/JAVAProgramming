package unit01;

public class P6_Task_05_StringInJava {

	public static void main(String[] args) {
		String s = "qwertyuiop asdfghjkl zxcvbnm";
		int arr[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			int ch = s.charAt(i)-97;
			if(ch>=0 && ch<=25)
			{
				arr[ch] = 1;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(arr[i]!=1)
			{
				System.out.println("Not Pangram");
				return;
			}
		}
		System.out.println("Pangram");

	}

}
