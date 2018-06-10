package week1day1;

public class ControlFlowStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		
		if (a>b){
			System.out.println(a);
		}
		else if(a<=b){
			System.out.println(b);
			
		}
		if (a>=c) {
			System.out.println(c);
		}
		else {
			System.out.println(a);
		}
		
		if (a<b) {
			System.out.println(a);
			if (b>a) {
				System.out.println(b);
			}
		}
		
		if (a<b) {
			if (c>a) {
				System.out.println(c);
			}
			else {
				System.out.println(a);
			}
		}

	}

}
