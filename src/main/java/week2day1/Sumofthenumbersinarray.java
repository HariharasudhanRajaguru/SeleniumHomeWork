package week2day1;

import java.util.Scanner;

public class Sumofthenumbersinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println("Enter elements:"); 
		
		int sum=0;
		for(int i=0;i<6;i++)
		{
		arr[i] = n.nextInt();
		}
		for(int temp:arr)
		{
		sum = sum+temp;
		}
		System.out.println("Sum of numbers in an array:"+sum);
		}
}
