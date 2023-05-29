package string;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses {
	
	public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
        
        
        for(int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') stack.add(c);
            else {
                if(!stack.isEmpty()) {
                    char popped = stack.pop();
                    if(c == ')' && popped != '(') return false;
                    if(c == '}' && popped != '{') return false;
                    if(c == ']' && popped != '[') return false;
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
	

	public static void main(String[] args) {
		ValidParentheses solution = new ValidParentheses();
		System.out.println("Expected: true");
		System.out.println("Result:   " + solution.isValid("()[]{}"));

	}

}
