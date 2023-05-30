package array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        dfs(new ArrayList<>(), candidates, 0, target, 0, output);
        return output;
    }
    
    
    private void dfs(List<Integer> prefix, int[] candidates, int sum, int target, int start, List<List<Integer>> output) {
        if(sum > target) return;
        if(sum == target) {
            output.add(new ArrayList<>(prefix));
            return;
        }
        
        for(int i = start; i < candidates.length; i++) {
            prefix.add(candidates[i]);
            dfs(prefix, candidates, sum+candidates[i], target, i, output);
            prefix.remove(prefix.size()-1);
        }
    }

    
	public static void main(String[] args) {
		CombinationSum solution = new CombinationSum();
		System.out.println("Expected: [[2, 2, 2, 2], [2, 3, 3], [3, 5]]");
		System.out.println("Result:   " + solution.combinationSum(new int[]{2,3,5}, 8));
	}

}
