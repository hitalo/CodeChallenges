package number;

// https://leetcode.com/problems/reverse-integer/description/
public class ReverseIntegerSolution2 {

	public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        int result;
        String val = String.valueOf(x*sign);
        StringBuilder resultString = new StringBuilder();
        
        for(char c : val.toCharArray()) resultString.insert(0, c);
        
        try {
            result = Integer.valueOf(resultString.toString()) * sign;
        } catch(Exception e) {
            result = 0;
        }
        return result;
    }
	
	public static void main(String[] args) {
		ReverseIntegerSolution2 solution = new ReverseIntegerSolution2();
		System.out.println("Expected: -321");
		System.out.println("Result:   " + solution.reverse(-123));
	}
}
