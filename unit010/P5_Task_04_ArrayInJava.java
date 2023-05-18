package unit01;

public class P5_Task_04_ArrayInJava {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int min = arr[0], max=arr[0];
		int min2 = arr[0], max2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min = arr[i];
			if(arr[i]>max)
				max = arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min2 && arr[i]>min)
				min2 = arr[i];
			if(arr[i]>max2 && arr[i]<max)
				max2 = arr[i];
		}
		System.out.println(min+"  "+max);
		System.out.println(min2+"  "+max2);
	}

}
