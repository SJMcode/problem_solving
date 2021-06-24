package problemsolving;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial!");
		int n=sc.nextInt();
		
		System.out.println(n+" factorial! is: "+factorial(n));
		sc.close();
	}
	
	public static long factorial(int n) {
		if(n<0)
			return -1;
		if(n==0 || n==1)
			return 1;
		
		return (n*factorial(n-1));
	}

}
