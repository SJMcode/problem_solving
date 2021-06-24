package problemsolving;
import java.util.*;
public class LargestFibonacciNumber {

	public static void main(String[] args) {
//		 eg: fib (6) 
//         -> [0,1,1,2,3,5] = o/p -> 5
//         eg: fib(13)
//         ->  [0,1,1,2,3,5,8,13] = o/p -> 8
//         fib(0) -> o/p = 0
//         fib(1) -> o/p = 0
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a number");
		        int t = sc.nextInt();
		        while (t-->0) {
		        	
		            int n = sc.nextInt();
		            int result = largestFibonacciNumber(n);
		            System.out.println(result);
		        }
		        sc.close();
		    }

		    static int largestFibonacciNumber(int n){
		    	int max;
		    	if(n<=0)
		    		return 1;
		    	else
		    		max = fib(n);
		    	
		    	
		    	return max;
	}
		    
		    public static int fib(int x) {
		    	
		    	int []fibonacci= {};
		    	int max=0;
		    	for(int i=2;i<x;i++)
		    		fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
		    	
		    	for(int i=0; i< fibonacci.length;i++)
		    			if(fibonacci[i]>max)
		    				max=fibonacci[i];
		    	
		    	return max;
		    }

}
