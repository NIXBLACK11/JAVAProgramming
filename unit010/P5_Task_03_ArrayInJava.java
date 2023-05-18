package unit01;

public class P5_Task_03_ArrayInJava {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int ele = 5;
		int f = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				arr[i] = -1;
				f = 1;
				i++;
			}
			if(f==1)
			{
				int t = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = t;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
