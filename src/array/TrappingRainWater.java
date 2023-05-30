package array;


// https://leetcode.com/problems/trapping-rain-water/description/
public class TrappingRainWater {
	
	public int trap(int[] height) {
        int leftMax = 0, rightMax = 0, trapped = 0;
        int left = 0, right = height.length-1;
        
        
        while(left <= right) {
            if(height[left] <= height[right]) {
                if(height[left] < leftMax) trapped += leftMax - height[left];
                else leftMax = height[left];
                left++;
            } else {
                if(height[right] < rightMax) trapped += rightMax - height[right];
                else rightMax = height[right];
                right--;
            }
        }
        return trapped;
    }

	public static void main(String[] args) {
		TrappingRainWater solution = new TrappingRainWater();
		System.out.println("Expected: 6");
		System.out.println("Result:   " + solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
	}

}
