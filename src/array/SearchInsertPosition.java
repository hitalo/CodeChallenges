package array;

import java.util.Arrays;

// https://leetcode.com/problems/search-insert-position/description/
class SearchInsertPosition {
	
	public int searchInsert(int[] nums, int target) {
        int n = Arrays.binarySearch(nums, target);
        return n >= 0 ? n : -1*(n+1);
    }

	public static void main(String[] args) {
		SearchInsertPosition solution = new SearchInsertPosition();
		System.out.println("Expected: 1");
		System.out.println("Result:   " + solution.searchInsert(new int[]{1,3,5,6}, 2));

	}

}
