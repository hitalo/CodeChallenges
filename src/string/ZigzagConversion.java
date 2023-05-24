package string;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/zigzag-conversion/description/
class ZigzagConversion {
    public String convert(String s, int numRows) {
        StringBuilder resultString = new StringBuilder();
        int direction = 1, row = 0;
        Map<Integer, String> rows = new HashMap<>();
        
        
        if(numRows == 1) return s;
        
        
        for(int i = 0; i < s.length(); i++) {
            rows.put(row, rows.getOrDefault(row, "") + s.charAt(i));
            row += direction;
            if(row > numRows-1) {
                row = numRows-2;
                direction = -1;
            } else if(row < 0) {
                row = 1;
                direction = 1;
            }
        }
        
        
        for(int i = 0; i < numRows; i++) 
            resultString.append(rows.getOrDefault(i, ""));
        
        return resultString.toString();
    }
    
    
    public static void main(String[] args) {
    	ZigzagConversion solution = new ZigzagConversion();
		System.out.println("Expected: PINALSIGYAHRPI");
		System.out.println("Result:   " + solution.convert("PAYPALISHIRING", 4));
	}
}
