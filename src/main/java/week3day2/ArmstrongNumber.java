package week3day2;

import java.util.Scanner;

import org.apache.commons.collections4.functors.WhileClosure;

public class ArmstrongNumber {
	
	public static int a,b,c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given input is an armstrong number or not
		
//		Scanner number1 = new Scanner(System.in);
//		System.out.println("Enter the starting number:");
//		int n1=number1.nextInt();
//		int temp=0;
//		int n2=n1;
//		int a,b,c;		
//		while (n1>0)		
//		{
//			a=n1/10;
//			b=n1%10;
//			n1=a;
//			c=(int)Math.pow(b,3);		
//			System.out.println(c);
//			temp=temp+c;				
//		}		
//		if(n2==temp) 
//		{
//			System.out.println(+temp+ " is an armstrong number");
//		}
//		else
//		{
//			System.out.println(+n2+ "  is not an armstrong number");
//		}


		// From 100 to 1000 "Armstrong Numbers"
		

		
		{
		for(int i=100;i<1000;i++)	
		{
			int n1=i;
			
			while(n1>0)			
			{			
				b=n1%10;	
				a=n1/10;
				c+=(int)Math.pow(b,3);
				n1=a;
			}
			if(i==c) 
			{
				System.out.println(i+"  is an armstrong number");
			}
			else
			{
				System.out.println(i+ "  is not an armstrong number");
			}
		}
		}
	}
}









