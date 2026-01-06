package hello;

public class leetcode53 {
	// using kadanes algorithm  -> optimal 
	public int maxSubArray(int[] nums) {
		int maxSum=nums[0];
		int currSum=0;
		for(int num:nums) {
			currSum+=num;
			maxSum=Math.max(maxSum,currSum);
			if(currSum<0) {
				currSum=0;
			}
		}
		return maxSum;
			
			
			
			
		}
		
	}
		
		// brute force approach
		
//		int maxSum=nums[0];
//		for( int i=0;i<nums.length;i++) {
//			int sum=0;
//			for(int j=i;j<nums.length;j++) {
//				sum=sum+nums[j];
//				maxSum=Math.max(maxSum,sum);
//			}
//		}
//			
//				return maxSum;
//				
//		
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
