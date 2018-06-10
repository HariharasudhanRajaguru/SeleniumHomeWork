package week1day1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class FirstandThirdLargestNumber {

	public static void main(String[] args) {

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
		System.out.println("First Largest Number is :" +arr[n-1]);
		System.out.println("Third Largest Number is :" +arr[n-3]);

	}

	}

