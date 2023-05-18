package unit01;

public class P6_Task_03_StringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i like this program very much";
		String s1[] = s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");			
		}
	}

}
