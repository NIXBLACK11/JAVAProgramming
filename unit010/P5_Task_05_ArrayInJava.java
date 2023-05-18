package unit01;

public class P5_Task_05_ArrayInJava {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,0};
		int index = 4;
		int ele = 99;
		for(int i=arr.length-1;i>=index;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[index] = ele;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
