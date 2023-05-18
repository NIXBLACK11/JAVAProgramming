package unit01;

public class P9_Task01_JaggedArray {

	/*
		* - Create a 2D array of 3 rows
		* - columns in each row must not be same
	*/
	public static void main(String[] args) {
		int arr[][] = {{1, 2, 3, 4},
						{5,6}, 
						{7,8,9},
						{10}};

		int arr1[][] = new int[][]{
			new int[] {1,2,3,4}, 
			new int[] {5,6}
		};
		
		int arr2[][] = new int[3][];
		arr2[0] = new int[4];
		arr2[1] = new int[2];
		arr2[2] = new int[3];
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+",");
			}
			System.out.println();
		}
	}

}
