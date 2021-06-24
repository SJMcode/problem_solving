package problemsolving;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix diamension: ");
		int n= sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n;i++) {
			for(int j=0; j<n;j++)
			
				arr[i][j]=sc.nextInt();
		}
		System.out.println("Diagonal Sum.....>\n"+diagSum(n,arr));
		sc.close();
	}
	
	
	public static int diagSum(int n, int arr[][]) {
		int diagSum=0;
		
		System.out.println("Print Matrix.....>");
		for(int i=0; i<n;i++) {
			for(int j=0; j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++)
			diagSum+=arr[i][i];
		
		return diagSum;
	}

}
