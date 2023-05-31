package array;


// https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarraySolution1 {

	public int maxSubArray(int[] nums) {
        int max = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] > 0) nums[i] += nums[i-1];
            max = Math.max(max, nums[i]);
        }
        return max;
    }
	
	public static void main(String[] args) {
		MaximumSubarraySolution1 solution = new MaximumSubarraySolution1();
		System.out.println("Expected: 6");
		System.out.println("Result:   " + solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
	}

}
