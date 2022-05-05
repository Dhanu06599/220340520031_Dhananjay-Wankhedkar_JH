import java.util.*;
class Sorting 
{
	static void insertionSort(int n, int[] arr1)
	{
		for (int i=1; i<n; i++)
		{
			int key  = arr1[i];
			int j =i-1;
			while (j>=0 && arr1[i]>key)
			{
				arr1[j+1] = arr1[i];
				j = j-1;
				
				printArr(arr1);
			}
			arr1[j+1] = key;
		}
	}
	
	static void printArr(int[] arr)
	{
		int n = arr.length;
		for (int i=0; i<n ; ++ i)
		{
			System.out.println(arr[i]+  " ");
			System.out.println();
		}
	}
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in); 
		int n = sc.nextInt();
		int[] arr =  new int[n];
		for (int i=0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		insertionSort(n , arr);
		printArr(arr);
	}
}