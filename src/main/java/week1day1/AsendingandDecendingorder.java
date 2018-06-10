package week1day1;

import java.util.Scanner;

public class AsendingandDecendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		System.out.println("Enter number of elements:");

		int n=s.nextInt();

		int arr[]=new int[n];

		System.out.println("Enter elements:");
		int temp=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}	


			}
		}
		for (int i=0;i<n;i++) {
			System.out.println("Ascending order:"+arr[i]);
		
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}	


			}
		}
		for (int i=0;i<n;i++) {
			System.out.println("Descending order:"+arr[i]);
		
		}

	}
	
	
}

