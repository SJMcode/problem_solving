package problemsolving;

import java.util.Scanner;

public class Pyramid1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		int k=0;
		for(int i=1;i<=n;i++, k=0) {
			for(int j=1;j<=n-i;j++) {
				 ///if(j!=0)
					System.out.print("  ");
				// System.out.print("*");
			}
			while(k!=2*i-1) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			
		}
		
		sc.close();

	}

}
