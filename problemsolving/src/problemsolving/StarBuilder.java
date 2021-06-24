package problemsolving;

import java.util.Scanner;

public class StarBuilder {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to build pyramid: ");
int n = sc.nextInt();
String[] pyramid = pyramidBuild(n);
for(int i=0;i<n;i++)
	System.out.println(pyramid[i]);
sc.close();
	
	}
	
	public static String getStar(int i) {
		StringBuilder starBuilder = new StringBuilder();
		
		if(i==0) {
			System.out.println("passed an an invalid iput");
		}
		
		for(int j=0;j<i;j++) {
			if(j!=0)
				starBuilder.append(" ");
			starBuilder.append("*");
		}
		//System.out.println("space used in "+i+" th "+"iteration: \n"+star.toString().length());
		return starBuilder.toString();
	}
	
	
	public static String[] pyramidBuild(int n) {
		
		String[] pyramid = new String[n];
		
		for(int i=0;i<n;i++){
			pyramid[i] = getStar(i+1);
		}
		return pyramid;
		
	}

	
	
	//  eg: 1 -4
	/*
	 *  for each row get star
	 *  
	 *  for i:1-4
	 *  	for each i: getStar(i)
	 *  
	 */
}
