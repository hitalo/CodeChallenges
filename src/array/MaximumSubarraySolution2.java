package array;


// https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarraySolution2 {

	public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
	
	public static void main(String[] args) {
		MaximumSubarraySolution2 solution = new MaximumSubarraySolution2();
		System.out.println("Expected: 6");
		System.out.println("Result:   " + solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
	}

}
