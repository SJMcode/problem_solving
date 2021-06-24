package problemsolving;

public class SortColors {

	public static void main(String[] args) {
	
		int[] nums = {0,1,2,1,0,2,1,0,0,0,0,0,0,1,2,1,2,1,2,1}; // 0\p -> 0000001111122222
		
		sortColors(nums);
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]);
		
	}
		    public static int[] sortColors(int[] nums) {
		        int low=0;
		        int mid=0;
		        int high=nums.length-1;
		        int temp;
		        
		        while(mid<=high) {
		        	
		        	switch(nums[mid]) {
		        	
		        	case 0:{
		        		temp = nums[mid];
		        		nums[mid]=nums[low];
		        		nums[low] =temp;
		        		mid++; low++;
		        		break;
		        		}
		        	case 1: mid++;
		        			break;
		        	case 2:
		        		{
		        		temp = nums[high];
		        		nums[high]=nums[mid];
		        		nums[mid] =temp;
		        		high--;
		        		break;
		        		}
		        			
		        	}
		        }
		    
		        
		      return nums;  
		        
		}
	}


