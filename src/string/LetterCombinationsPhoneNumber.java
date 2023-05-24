package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
class LetterCombinationsPhoneNumber {
	public List<String> letterCombinations(String digits) {
		if (digits.length() == 0)
			return new ArrayList<>();
		List<String> out = new ArrayList<>();
		Map<Character, List<String>> map = new HashMap<>();
		fillMap(map);

		helper(new StringBuilder(), digits, map, out, 0);

		return out;
	}

	private void helper(StringBuilder curr, String digits, Map<Character, List<String>> map, List<String> out,
			int start) {

		if (curr.length() == digits.length()) {
			out.add(curr.toString());
			return;
		}

		for (int i = start; i < digits.length(); i++) {
			for (int j = 0; j < map.get(digits.charAt(i)).size(); j++) {
				String newChar = map.get(digits.charAt(i)).get(j);
				helper(curr.append(newChar), digits, map, out, i + 1);
				curr.delete(curr.length() - newChar.length(), curr.length());
			}
		}

	}

	private void fillMap(Map<Character, List<String>> map) {
		map.put('2', new ArrayList<>(Arrays.asList("a", "b", "c")));
		map.put('3', new ArrayList<>(Arrays.asList("d", "e", "f")));
		map.put('4', new ArrayList<>(Arrays.asList("g", "h", "i")));
		map.put('5', new ArrayList<>(Arrays.asList("j", "k", "l")));
		map.put('6', new ArrayList<>(Arrays.asList("m", "n", "o")));
		map.put('7', new ArrayList<>(Arrays.asList("p", "q", "r", "s")));
		map.put('8', new ArrayList<>(Arrays.asList("t", "u", "v")));
		map.put('9', new ArrayList<>(Arrays.asList("w", "x", "y", "z")));
	}
	
	
	public static void main(String[] args) {
		LetterCombinationsPhoneNumber solution = new LetterCombinationsPhoneNumber();
		System.out.println("Expected: [ad, ae, af, bd, be, bf, cd, ce, cf]");
		System.out.println("Result:   " + solution.letterCombinations("23"));
	}
}
