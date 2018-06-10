package harish;

import java.util.Scanner;

public class CodingChallenge16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter no of rows:");

		Scanner input = new Scanner(System.in);

		int n1 = input.nextInt();

		System.out.println("enter no of columns:");

		Scanner input1 = new Scanner(System.in);

		int n2 = input1.nextInt();

		int k = 1;


		int[][] a = new int[n1][n2];

		for (int i = 0; i < n1;i++) {

			for (int j = 0; j < n2; j++) {

				a[i][j] = k;

				k++;
				while (i!=j) {
					System.out.print(a[i][j] + "\t");

				}

			}

		}

	}

}


