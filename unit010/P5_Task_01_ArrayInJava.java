package unit01;

public class P5_Task_01_ArrayInJava {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,1,2,3,5,2};
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		int nArr[] = new int[max+1];
		for(int i=0;i<arr.length;i++)
		{	
			nArr[arr[i]]++;
		}
		System.out.print("Duplicate Elements : ");
		for(int i=0;i<max+1;i++)
		{
			if(nArr[i]>1)
			{
				System.out.print(i+" ");
			}
		}

	}

}
