package string;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LengthOfLongestSubstring {

	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		StringBuilder visited = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			String c = "" + s.charAt(i);
			if (visited.indexOf(c) != -1) {
				max = Math.max(max, visited.length());
				visited = new StringBuilder(visited.substring(visited.indexOf(c) + 1));
			}
			visited.append(c);
		}
		return Math.max(max, visited.length());
	}

	
	public static void main(String[] args) {
		LengthOfLongestSubstring solution = new LengthOfLongestSubstring();
		System.out.println("Expected: 3");
		System.out.println("Result:   " + solution.lengthOfLongestSubstring("pwwkew"));
	}
}
