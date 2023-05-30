package string;

// https://leetcode.com/problems/count-and-say/description/
public class CountAndSay {
	
	public String countAndSay(int n) {
        if(n==1) return "1";
        
        String s = countAndSay(n-1);
        StringBuilder say = new StringBuilder();
        
        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            int count = 1;
            while(i+count < s.length() && s.charAt(i+count) == c) count++;
            i += count;
            say.append(count).append(c);
        }
        
        return say.toString();
    }
	

	public static void main(String[] args) {
		CountAndSay solution = new CountAndSay();
		System.out.println("Expected: 1211");
		System.out.println("Result:   " + solution.countAndSay(4));
	}
}
