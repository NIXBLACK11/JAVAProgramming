package unit01;

public class RemoveVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 2, 3, 4, 5};
		int len = arr.length, j=0, val=2;
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]==val)
			{
				j++;
			}
			arr[i] = arr[j];
			j++;
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]+",");
		}
	}

}
