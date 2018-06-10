package week2day1;

public class SwapingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=5;


		if(a!=b) 
		{

			b+=a;
			
			a=b-a;
			
		    b-=a;
			
			System.out.println("a:"+a);

			System.out.println("b:"+b);

		}
	}

}
