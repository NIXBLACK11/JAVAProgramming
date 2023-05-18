package unit01;

public class P6_Task_01_StringInJava {

	public static void main(String[] args) {
		String s = "754571";
		for(int i=0;i<s.length()/2+1;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				System.out.println("Not Palindrome");
				return;
			}
		}
		System.out.println("Palindrome");

	}

}
