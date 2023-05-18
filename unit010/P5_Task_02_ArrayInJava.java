package unit01;

public class P5_Task_02_ArrayInJava {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int k = 2;
		for(int i=0;i<arr.length-k;i++)
		{
			int t = arr[i];
			arr[i] = arr[i+k];
			arr[i+k] = t;
		}
		
		System.out.print("Rotated Array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
